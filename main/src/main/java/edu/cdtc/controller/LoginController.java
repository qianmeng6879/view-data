package edu.cdtc.controller;

import edu.cdtc.entity.User;
import edu.cdtc.service.UserService;
import edu.cdtc.vo.UserVO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

/**
 * @author zero
 * @email qianmeng6879@163.com
 * @since 2022/12/12
 */
@Controller
public class LoginController {
    private static final Logger LOGGER = LoggerFactory.getLogger(LoginController.class);

    @Autowired
    private UserService userService;

    @GetMapping("/login")
    public String loginPage() {
        return "login";
    }

    /**
     * 用户登录接口
     */
    @ResponseBody
    @PostMapping("/login")
    public Object loginHandler(@RequestBody User user, HttpServletRequest request) {
        LOGGER.info("username:{},password:{}", user.getUsername(), user.getPassword());
        User currnetUser = userService.login(user.getUsername(), user.getPassword());
        Map<String, Object> map = new HashMap<>();
        if (currnetUser == null) {
            map.put("message", "用户名或密码错误");
            map.put("code", 400);
            return map;
        }

        // 设置Session
        request.getSession().setAttribute("user", user);

        map.put("message", "登录成功");
        map.put("code", 200);
        map.put("sessionId", request.getSession().getId());
        return map;

    }


}
