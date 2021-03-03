package com.garfield.config.controller;

import com.garfield.config.config.ServerConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author jingliyuan
 * @date 2021/1/4
 */
@RestController
@RequestMapping
public class ClientController {
    @Autowired
    private ServerConfig serverConfig;
    @GetMapping("/getName")
    public String getName(){
        return serverConfig.getName();
    }

    public static void main(String[] args) {
        String temp = "aA";
        System.out.println(temp.toUpperCase());
        System.out.println(temp.toLowerCase());


    }
}
