package com.garfield.dubbo.provider.config;

import com.garfield.dubbo.provider.service.HelloService;
import com.garfield.dubbo.provider.service.impl.HelloServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author jingliyuan
 * @date 2020/11/20
 */
@Configuration
public class GlobalConfig {
    @Bean
    public HelloService getHelloService(){
        return new HelloServiceImpl();
    }
}
