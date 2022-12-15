package edu.cdtc.service.impl;

import edu.cdtc.dao.ProvinceofchinaDao;
import edu.cdtc.dto.MapData;
import edu.cdtc.entity.Provinceofchina;
import edu.cdtc.service.PatientService;
import edu.cdtc.service.ProvinceofchinaService;
import edu.cdtc.dto.EpidemicData;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

/**
 * (Provinceofchina)表服务实现类
 *
 * @author makejava
 * @since 2022-12-08 10:46:30
 */
@Service("provinceofchinaService")
public class ProvinceofchinaServiceImpl implements ProvinceofchinaService {
    private static final Logger LOGGER = LoggerFactory.getLogger(ProvinceofchinaServiceImpl.class);
    @Resource
    private ProvinceofchinaDao provinceofchinaDao;

    @Autowired
    private PatientService patientService;

    private static final DateTimeFormatter DATE_TIME_FORMATTER = DateTimeFormatter.ofPattern("yyyy.MM.dd HH:mm");

    @Override
    public EpidemicData getEpidemicData() {
        EpidemicData epidemicData = provinceofchinaDao.findEpidemicData();

        // 设置登记人数
        epidemicData.setRegistration(patientService.count());

        epidemicData.setTime(DATE_TIME_FORMATTER.format(LocalDateTime.now()));
        return epidemicData;
    }

    @Override
    public List<MapData> getMapData() {
        return provinceofchinaDao.findMap();
    }

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public Provinceofchina queryById(Integer id) {
        return this.provinceofchinaDao.queryById(id);
    }

    /**
     * 分页查询
     *
     * @param provinceofchina 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    @Override
    public Page<Provinceofchina> queryByPage(Provinceofchina provinceofchina, PageRequest pageRequest) {
        long total = this.provinceofchinaDao.count(provinceofchina);
        return new PageImpl<>(this.provinceofchinaDao.queryAllByLimit(provinceofchina, pageRequest), pageRequest, total);
    }

    /**
     * 新增数据
     *
     * @param provinceofchina 实例对象
     * @return 实例对象
     */
    @Override
    public Provinceofchina insert(Provinceofchina provinceofchina) {
        this.provinceofchinaDao.insert(provinceofchina);
        return provinceofchina;
    }

    /**
     * 修改数据
     *
     * @param provinceofchina 实例对象
     * @return 实例对象
     */
    @Override
    public Provinceofchina update(Provinceofchina provinceofchina) {
        this.provinceofchinaDao.update(provinceofchina);
        return this.queryById(provinceofchina.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.provinceofchinaDao.deleteById(id) > 0;
    }
}
