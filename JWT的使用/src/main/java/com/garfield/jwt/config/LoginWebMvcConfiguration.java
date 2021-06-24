package com.garfield.jwt.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * LoginWebMvcConfiguration
 *
 * @author zhaojian
 * @date 2021/6/24
 */
@Configuration
public class LoginWebMvcConfiguration implements WebMvcConfigurer {
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new LoginConfig()).excludePathPatterns("/user/login");
        WebMvcConfigurer.super.addInterceptors(registry);
    }
}
