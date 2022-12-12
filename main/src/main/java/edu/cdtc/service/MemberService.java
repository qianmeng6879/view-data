package edu.cdtc.service;

import edu.cdtc.entity.Member;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

/**
 * (Member)表服务接口
 *
 * @author makejava
 * @since 2022-12-08 10:24:24
 */
public interface MemberService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    Member queryById(Integer id);

    /**
     * 分页查询
     *
     * @param member 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    Page<Member> queryByPage(Member member, PageRequest pageRequest);

    /**
     * 新增数据
     *
     * @param member 实例对象
     * @return 实例对象
     */
    Member insert(Member member);

    /**
     * 修改数据
     *
     * @param member 实例对象
     * @return 实例对象
     */
    Member update(Member member);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);

}
