package com.garfield.forkjoinpool.service;

import com.garfield.forkjoinpool.bean.BalanceBo;
import com.garfield.forkjoinpool.bean.UserBo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @author jingliyuan
 * @date 2020/8/29
 */
@Service
public class ForkJoinService1 {
    @Autowired
    private RestTemplate  restTemplate;

    /**
     * 初始化“我的”页面数据
     */
    public void init(){
        UserBo userBo = restTemplate.getForObject("http://localhost:8090/forkjoinpool/getName", UserBo.class);
        BalanceBo balanceBo = restTemplate.getForObject("http://localhost:8090/forkjoinpool/getBalance", BalanceBo.class);
        System.out.println("userBo的值是:"+userBo);
        System.out.println("balanceBo的值是:"+balanceBo);
    }
}
