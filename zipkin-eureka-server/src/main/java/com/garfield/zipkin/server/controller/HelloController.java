package com.garfield.zipkin.server.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author jingliyuan
 * @date 2020/12/25
 */
@RestController
@RequestMapping(value = "/eureka")
public class HelloController {
    @GetMapping("/sayHello")
    public String sayHello(){
        return "12.25 圣诞节快乐呀";
    }

    @GetMapping("/testZipkin")
    public String testZipkin(){
        return "Spring-Cloud 链路追踪测试";
    }
}
