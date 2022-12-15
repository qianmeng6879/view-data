package edu.cdtc.service.impl;

import edu.cdtc.dao.UserVisitDao;
import edu.cdtc.entity.UserVisit;
import edu.cdtc.service.UserVisitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

/**
 * @author zero
 * @email qianmeng6879@163.com
 * @since 2022/12/14
 */
@Service
public class UserVisitServiceImpl implements UserVisitService {
    private static final DateTimeFormatter DATE_TIME_FORMATTER = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

    @Autowired
    private UserVisitDao dao;

    @Override
    public List<UserVisit> list() {
        return dao.selectList();
    }

    @Override
    public long count() {
        return dao.getCount();
    }

    @Override
    public boolean save(UserVisit userVisit) {
        userVisit.setCreateTime(DATE_TIME_FORMATTER.format(LocalDateTime.now()));
        return dao.insert(userVisit) > 0;
    }
}
