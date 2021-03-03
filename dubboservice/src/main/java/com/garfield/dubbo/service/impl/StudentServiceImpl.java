package com.garfield.dubbo.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.garfield.dubbo.service.UserService;
@Service(group = "student")
public class StudentServiceImpl implements UserService {
    @Override
    public String sayHello(String name) {
        return "good night:" + name;
    }
}
