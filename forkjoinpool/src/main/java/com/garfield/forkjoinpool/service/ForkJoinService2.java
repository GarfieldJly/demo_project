package com.garfield.forkjoinpool.service;

import com.garfield.forkjoinpool.bean.BalanceBo;
import com.garfield.forkjoinpool.bean.UserBo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @author jingliyuan
 * @date 2020/8/29
 * 改成ForkJoinPool，并发的http请求
 */
@Service
public class ForkJoinService2 {
    @Autowired
    private RestTemplate  restTemplate;

    /**
     * 初始化“我的”页面数据
     */
    public void init(){
        restTemplate.getForObject("http://localhost:8090/forkjoinpool/getName", UserBo.class);
        restTemplate.getForObject("http://localhost:8090/forkjoinpool/getBalance", BalanceBo.class);


    }
}
