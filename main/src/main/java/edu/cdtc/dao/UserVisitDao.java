package edu.cdtc.dao;

import edu.cdtc.entity.UserVisit;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author zero
 * @email qianmeng6879@163.com
 * @since 2022/12/14
 */
@Mapper
public interface UserVisitDao {
    List<UserVisit> selectList();

    long getCount();

    int insert(UserVisit userVisit);
}
