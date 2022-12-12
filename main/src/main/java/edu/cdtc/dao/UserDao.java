package edu.cdtc.dao;

import edu.cdtc.entity.User;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * @author zero
 * @email qianmeng6879@163.com
 * @since 2022/12/12
 */
@Mapper
public interface UserDao {
    User selectById(Integer id);

    User selectByUsername(String username);

    List<User> selectList();

    int insert(User user);

    int delete(Integer id);
}
