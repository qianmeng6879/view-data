package edu.cdtc.service;

import edu.cdtc.entity.User;

import java.util.List;

/**
 * @author zero
 * @email qianmeng6879@163.com
 * @since 2022/12/12
 */
public interface UserService {
    User get(Integer id);

    List<User> list();

    User login(String username, String password);

    boolean remove(Integer id);

    boolean save(User user);
}