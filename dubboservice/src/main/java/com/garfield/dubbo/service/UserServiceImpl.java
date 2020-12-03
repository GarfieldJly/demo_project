package com.garfield.dubbo.service;

import com.alibaba.dubbo.config.annotation.Service;

/**
 * @author jingliyuan
 * @date 2020/12/1
 */
@Service
public class UserServiceImpl implements UserService {
    @Override
    public String sayHello(String name) {
        return "hello," + name;
    }
}
