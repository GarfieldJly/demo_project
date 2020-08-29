package com.garfield.function.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author jingliyuan
 * @date 2020/8/29
 */
@RestController
@RequestMapping
public class TestController {
    @GetMapping("/name")
    public void testHost(){
        System.out.println("hello,Garfield");
    }
}
