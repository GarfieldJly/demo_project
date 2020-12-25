package com.garfield.peer2.controller;

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
        return "12.25 Happy Chrimastic";
    }
}
