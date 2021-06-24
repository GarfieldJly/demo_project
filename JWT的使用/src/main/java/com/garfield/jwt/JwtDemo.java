package com.garfield.jwt;

import com.alibaba.fastjson.JSONObject;
import com.garfield.jwt.domain.UserBean;
import com.garfield.jwt.util.ConstantUtils;
import io.jsonwebtoken.Claims;
import io.jsonwebtoken.JwtBuilder;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

import java.util.Date;

/**
 * JwtDemo
 *
 * @author jly
 * @date 2021/6/24
 */
public class JwtDemo {

    public static void main(String[] args) {
        String token = loginIn();
        parseToken(token);
    }

    private static String loginIn(){
        UserBean userBean = new UserBean();
        userBean.setUserName("garfield");
        userBean.setPassword("134763");

        String userJson = JSONObject.toJSONString(userBean);
        System.out.println("userJson:"+userJson);

        JwtBuilder builder= Jwts.builder()
//                .setId("888")   //设置唯一编号
                .setSubject(userJson)//设置主题  可以是JSON数据
                .setIssuedAt(new Date())//设置签发日期
                .signWith(SignatureAlgorithm.HS256, ConstantUtils.SECRET);//设置签名 使用HS256算法，并设置SecretKey(字符串)
        //构建 并返回一个字符串
        System.out.println( builder.compact() );
        return builder.compact();
    }

    private static void parseToken(String token){
        Claims claims = Jwts.parser().setSigningKey(ConstantUtils.SECRET).parseClaimsJws(token).getBody();
        System.out.println(claims);
    }


}
