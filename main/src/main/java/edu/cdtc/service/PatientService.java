package edu.cdtc.service;

import edu.cdtc.entity.Patient;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

/**
 * (Patient)表服务接口
 *
 * @author makejava
 * @since 2022-12-08 10:46:30
 */
public interface PatientService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    Patient queryById(Integer id);

    /**
     * 分页查询
     *
     * @param patient 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    Page<Patient> queryByPage(Patient patient, PageRequest pageRequest);

    /**
     * 新增数据
     *
     * @param patient 实例对象
     * @return 实例对象
     */
    Patient insert(Patient patient);

    /**
     * 修改数据
     *
     * @param patient 实例对象
     * @return 实例对象
     */
    Patient update(Patient patient);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);

}
