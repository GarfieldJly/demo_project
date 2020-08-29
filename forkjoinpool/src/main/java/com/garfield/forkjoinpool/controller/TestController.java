package com.garfield.forkjoinpool.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.garfield.forkjoinpool.bean.BalanceBo;
import com.garfield.forkjoinpool.bean.UserBo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.TimeUnit;

/**
 * @author jingliyuan
 * @date 2020/8/29
 */
@RestController
@RequestMapping("/forkjoinpool")
public class TestController {
    @GetMapping("/getName")
    public String getName(){
        try {
            TimeUnit.SECONDS.sleep(2);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        UserBo userBo = new UserBo();
        return JSON.toJSONString(userBo);
    }

    @GetMapping("/getBalance")
    public String getBalance(){
        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        BalanceBo balanceBo = new BalanceBo();
        return JSON.toJSONString(balanceBo);
    }



}
