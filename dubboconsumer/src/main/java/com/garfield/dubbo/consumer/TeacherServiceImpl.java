package com.garfield.dubbo.consumer;

import com.alibaba.dubbo.config.annotation.Service;
import com.garfield.dubbo.service.UserService;
@Service
public class TeacherServiceImpl implements UserService {
    @Override
    public String sayHello(String name) {
        return "容器出错";
    }
}
