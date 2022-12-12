package edu.cdtc.controller;

import edu.cdtc.entity.Member;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Zhang Peng
 * @email qianmeng6879@163.com
 * @since 2022/12/8
 */
@RestController
public class MemberController {
    private static final Logger LOGGER = LoggerFactory.getLogger(MemberController.class);
    @RequestMapping("/members")
    public Object addUser(Member member){
        LOGGER.info(member.getUsername() + "  " + member.getPassword());
        return member;
    }
}
