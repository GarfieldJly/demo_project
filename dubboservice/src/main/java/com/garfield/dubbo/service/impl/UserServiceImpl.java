package com.garfield.dubbo.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.garfield.dubbo.service.UserService;

import javax.validation.constraints.NotNull;

/**
 * @author jingliyuan
 * @date 2020/12/1
 */
@Service(group = "user",validation = "true")
public class UserServiceImpl implements UserService {
    @Override
    public String sayHello(@NotNull String name) {
        return "hello," + name;
    }
}
