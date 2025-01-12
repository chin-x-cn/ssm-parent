package com.atguigu.spring.ioc.config;

import ch.qos.logback.core.CoreConstants;
import com.atguigu.spring.ioc.bean.Car;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * @Program: ssm-parent
 * @Description:
 * @Author: Chen
 * @Create: 2025-01-12 21:34
 **/
@Import({CoreConstants.class})
@ComponentScan(basePackages = "com.atguigu.spring")
@Configuration
public class AppConfig {
}
