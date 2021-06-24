package com.garfield.jwt.controller;

import com.alibaba.fastjson.JSONObject;
import com.garfield.jwt.domain.UserBean;
import com.garfield.jwt.util.ConstantUtils;
import com.garfield.jwt.util.UserLocalThread;
import io.jsonwebtoken.JwtBuilder;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

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
    public String login(@RequestParam(value = "userBean") UserBean userBean){
        return loginIn(userBean);
    }


    @GetMapping("/get")
    public Boolean login(){
        return true;
    }


    private  String loginIn(UserBean userBean){
        UserLocalThread.localThread.set(userBean);
        String userJson = JSONObject.toJSONString(userBean);
        System.out.println("userJson:"+userJson);

        JwtBuilder builder= Jwts.builder()
//                .setId("888")   //设置唯一编号
                .setSubject(userJson)//设置主题  可以是JSON数据
                .setIssuedAt(new Date())//设置签发日期
//                .setExpiration();
                .signWith(SignatureAlgorithm.HS256, ConstantUtils.SECRET);//设置签名 使用HS256算法，并设置SecretKey(字符串)
        //构建 并返回一个字符串
        System.out.println( builder.compact() );
        return builder.compact();
    }
}
