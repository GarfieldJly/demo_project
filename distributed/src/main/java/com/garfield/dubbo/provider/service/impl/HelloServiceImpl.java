package com.garfield.dubbo.provider.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.garfield.dubbo.provider.service.HelloService;

/**
 * @author jingliyuan
 * @date 2020/11/20
 */
@Service(version = "1.0.0")
public class HelloServiceImpl implements HelloService {
    @Override
    public String sayHello() {
        return "Hello,加菲猫";
    }
}
