package edu.cdtc;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author zero
 * @email qianmeng6879@163.com
 */
@SpringBootApplication
@MapperScan("edu.cdtc.dao")
public class StartApplication {
    public static void main(String[] args) {
        SpringApplication.run(StartApplication.class, args);
    }
}