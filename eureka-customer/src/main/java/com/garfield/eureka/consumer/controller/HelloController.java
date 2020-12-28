package com.garfield.eureka.consumer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author jingliyuan
 * @date 2020/12/25
 */
@RestController
@RequestMapping(value = "/eureka")
public class HelloController {
    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/say")
    public String sayHello(){
        return restTemplate.getForObject("http://HELLOSERVER/eureka/sayHello", String.class,"");
    }
}
