package edu.cdtc.service.impl;

import edu.cdtc.dao.UserDao;
import edu.cdtc.entity.User;
import edu.cdtc.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author zero
 * @email qianmeng6879@163.com
 * @since 2022/12/12
 */
@Service
public class UserServiceImpl implements UserService {
    private static final Logger LOGGER = LoggerFactory.getLogger(UserServiceImpl.class);

    @Autowired
    private UserDao userDao;

    @Override
    public User get(Integer id) {
        return userDao.selectById(id);
    }

    @Override
    public List<User> list() {
        return userDao.selectList();
    }

    @Override
    public User login(String username, String password) {
        User currentUser = userDao.selectByUsername(username);

        if (currentUser == null || !currentUser.getPassword().equals(password)) {
            return null;
        }
        return currentUser;
    }

    @Override
    public boolean remove(Integer id) {
        return userDao.delete(id) > 0;
    }

    @Override
    public boolean save(User user) {
        if (userDao.selectByUsername(user.getUsername()) != null) {
            LOGGER.info("{} 用户名已存在", user.getUsername());
            return false;
        }
        if (user.getAge() == null) {
            user.setAge(0);
        }
        return userDao.insert(user) > 0;
    }
}

