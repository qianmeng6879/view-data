package edu.cdtc.dao;

import edu.cdtc.entity.Member;

import java.util.List;

/**
 * @author Zhang Peng
 * @email qianmeng6879@163.com
 * @since 2022/12/7
 */

public interface MemberDao {

    Member selectById(Integer id);

    List<Member> selectList();

    List<Member> selectSplit(int current, int size);
}
