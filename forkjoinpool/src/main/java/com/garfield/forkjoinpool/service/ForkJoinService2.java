package com.garfield.forkjoinpool.service;

import com.alibaba.fastjson.JSONObject;
import com.garfield.forkjoinpool.bean.BalanceBo;
import com.garfield.forkjoinpool.bean.HttpRequestBo;
import com.garfield.forkjoinpool.bean.UserBo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.ForkJoinTask;

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
    public JSONObject init() throws ExecutionException, InterruptedException {
        ArrayList<String> urlList = new ArrayList<>();
        urlList.add("http://localhost:8090/forkjoinpool/getName");
        urlList.add("http://localhost:8090/forkjoinpool/getBalance");

        ForkJoinPool forkJoinPool = new ForkJoinPool(5);
        ForkJoinTask<JSONObject> submit = forkJoinPool.submit(new HttpRequestBo(urlList, 0, urlList.size() - 1, restTemplate));
        JSONObject jsonObject = submit.get();
        System.out.println("输出的结果:" + jsonObject);
        return jsonObject;
    }
}
