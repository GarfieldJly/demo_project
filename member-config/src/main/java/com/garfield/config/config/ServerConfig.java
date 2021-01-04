package com.garfield.config.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.annotation.Configuration;

/**
 * @author jingliyuan
 * @date 2021/1/4
 */
@Configuration
//通过调用接口刷新配置中心配置文件，需要添加该注解进行识别
@RefreshScope
public class ServerConfig {
    @Value("${spring-cloud-member-config}")
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
