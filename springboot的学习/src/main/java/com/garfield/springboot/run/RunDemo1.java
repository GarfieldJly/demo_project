package com.garfield.springboot.run;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author jingliyuan
 * @date 2020/8/21
 * @RestController与@RequestMapping注解是Spring MVC的注解
 */
@RestController
@EnableAutoConfiguration
public class RunDemo1 {

    @RequestMapping("/garfield")
    public String sayHello(){
        return "hello,Garifled";
    }

    public static void main(String[] args) {
        SpringApplication.run(RunDemo1.class);
    }
}
