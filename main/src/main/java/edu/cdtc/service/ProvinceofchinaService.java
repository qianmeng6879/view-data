package edu.cdtc.service;

import edu.cdtc.entity.Provinceofchina;
import edu.cdtc.dto.EpidemicData;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

/**
 * (Provinceofchina)表服务接口
 *
 * @author makejava
 * @since 2022-12-08 10:46:30
 */
public interface ProvinceofchinaService {

    EpidemicData getEpidemicData();


    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    Provinceofchina queryById(Integer id);

    /**
     * 分页查询
     *
     * @param provinceofchina 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    Page<Provinceofchina> queryByPage(Provinceofchina provinceofchina, PageRequest pageRequest);

    /**
     * 新增数据
     *
     * @param provinceofchina 实例对象
     * @return 实例对象
     */
    Provinceofchina insert(Provinceofchina provinceofchina);

    /**
     * 修改数据
     *
     * @param provinceofchina 实例对象
     * @return 实例对象
     */
    Provinceofchina update(Provinceofchina provinceofchina);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);

}
