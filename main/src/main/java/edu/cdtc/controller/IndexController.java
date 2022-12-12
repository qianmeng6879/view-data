package edu.cdtc.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Zhang Peng
 * @email qianmeng6879@163.com
 * @since 2022/12/7
 */
@RestController
@RequestMapping("index")
public class IndexController {
    private static final Logger LOGGER = LoggerFactory.getLogger(IndexController.class);

    // 前端页面异常，在@Controller下，方法返回值为void，前端拿不到数据
    // 将方法返回值改为String，返回一个页面，在templates目录下创建相应的html文件
    @RequestMapping("get")
    public String  get(){
        LOGGER.info("index page access");
        return "index";
    }
}
