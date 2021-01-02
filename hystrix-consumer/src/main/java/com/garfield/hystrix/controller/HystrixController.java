package com.garfield.hystrix.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author jingliyuan
 * @date 2020/12/30
 */
@RestController
@RequestMapping("/hystrix")
public class HystrixController {
    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/say")
    @HystrixCommand(fallbackMethod = "errorMethod")
    public String say(){
        return restTemplate.getForObject("http://HELLOSERVER/eureka/sayHello", String.class,"");
    }

    public String errorMethod(){
        return "服务降级啦.....";
    }

}
