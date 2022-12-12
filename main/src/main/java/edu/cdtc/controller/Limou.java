package edu.cdtc.controller;


import edu.cdtc.entity.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author zero
 * @email qianmeng6879@163.com
 * @since 2022/12/12
 */
@Controller
public class Limou {
    private static final Logger LOGGER = LoggerFactory.getLogger(Limou.class);

    @RequestMapping("register")
    public String zhuce() {
        return "register";
    }


    @ResponseBody
    @PostMapping("/register/handler")
    public Object registerHandler(User user) {
        LOGGER.info("name:{},pass:{},email:{}", user.getUsername(), user.getPassword(), user.getEmail());
        return user;
    }

}
