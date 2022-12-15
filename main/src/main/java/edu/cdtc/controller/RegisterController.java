package edu.cdtc.controller;

import com.github.aidensuen.util.StringUtil;
import edu.cdtc.dto.RestData;
import edu.cdtc.entity.User;
import edu.cdtc.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;

/**
 * @author zero
 * @email qianmeng6879@163.com
 * @since 2022/12/13
 */
@Controller
public class RegisterController {
    private static final Logger LOGGER = LoggerFactory.getLogger(RegisterController.class);
    @Autowired
    private UserService userService;

    private static final String EMAIL_PATTERN = "[a-zA-Z0-9]\\w+@(.*?)\\.(.*?)";

    @GetMapping("/register")
    public String registerPage() {
        return "register";
    }

    @ResponseBody
    @PostMapping("/register")
    public Object registerHandler(@RequestBody User user) {
        if (!(StringUtil.hasLength(user.getUsername()) && StringUtil.hasLength(user.getPassword()) && StringUtil.hasLength(user.getEmail()))) {
            RestData restData = new RestData();
            restData.setCode(200);
            restData.setMessage("表单信息不完整");
            return restData;
        }

        if(!user.getEmail().matches(EMAIL_PATTERN)){
            RestData restData = new RestData();
            restData.setCode(410);
            restData.setMessage("邮箱格式错误");
            return restData;
        }


        boolean result = userService.save(user);

        if (!result) {
            return Map.of("message", "注册失败，用户名已存在", "code", 400);
        }

        return Map.of("message", "注册成功", "code", 200);
    }
}

