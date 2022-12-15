package edu.cdtc.service;

import edu.cdtc.entity.UserVisit;

import java.util.List;

/**
 * @author zero
 * @email qianmeng6879@163.com
 * @since 2022/12/14
 */
public interface UserVisitService {
    List<UserVisit> list();

    long count();

    boolean save(UserVisit userVisit);
}
