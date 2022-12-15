package edu.cdtc.config;

import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author zero
 * @email qianmeng6879@163.com
 * @since 2022/12/14
 */
@ServletComponentScan("edu.cdtc.filter")
@Configuration
public class WebConfig {
}
