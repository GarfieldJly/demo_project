package com.garfield.jwt.controller;

import com.garfield.jwt.domain.UserBean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * LoginController
 *
 * @author zhaojian
 * @date 2021/6/24
 */
@RestController
@RequestMapping("/user")
public class LoginController {
    @GetMapping("/login")
    public void login(@RequestParam(value = "userBean") UserBean userBean){

    }
}
