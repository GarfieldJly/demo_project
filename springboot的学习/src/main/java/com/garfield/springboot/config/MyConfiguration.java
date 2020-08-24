package com.garfield.springboot.config;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

/**
 * @author jingliyuan
 * @date 2020/8/21
 * 如果发现启用了不想要的自动配置项，你可以使用@EnableAutoConfiguration注解的exclude属性禁用它们m
 */
@EnableAutoConfiguration(exclude = {DataSourceAutoConfiguration.class})
public class MyConfiguration {
}
