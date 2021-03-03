package com.garfield.exception.controller;

import com.garfield.exception.config.MyException;
import org.springframework.web.bind.annotation.*;

/**
 * @author jingliyuan
 * @date 2021/2/22
 */
@RestController
@RequestMapping("/user")
public class UserController {
    @GetMapping("getName")
    public void getName(@ModelAttribute("name") String name) {
        System.out.println("名字是:" + name);
    }

    @GetMapping("getAge")
    public void getAge(@RequestParam("age") Integer age) {
        if(age % 2 == 0){
            throw new MyException("101","年龄为偶数");
        }

    }
}
