package com.garfield.forkjoinpool.service;

import com.alibaba.fastjson.JSONObject;
import com.garfield.forkjoinpool.bean.HttpRequestBo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.ForkJoinTask;

/**
 * @author jingliyuan
 * @date 2020/8/29
 * 改成CountDownLatch，并发的http请求
 */
@Service
public class CountDownLatchService3 {
    @Autowired
    private RestTemplate  restTemplate;

    private CountDownLatch countDownLatch = new CountDownLatch(2);
    //结果集
    private ArrayList<JSONObject> resultList = new ArrayList<>();

    /**
     * 初始化“我的”页面数据
     */
    public ArrayList<JSONObject> init() throws  InterruptedException {

        new Thread(() ->{
            JSONObject result = getResult("http://localhost:8090/forkjoinpool/getName");
            resultList.add(result);
            countDownLatch.countDown();
        }).start();

        new Thread(() ->{
            JSONObject result = getResult("http://localhost:8090/forkjoinpool/getBalance");
            resultList.add(result);
            countDownLatch.countDown();
        }).start();

        countDownLatch.await();
        resultList.forEach(System.out::println);
        return resultList;
    }

    public JSONObject getResult(String url){
        System.out.println(Thread.currentThread() + "开始执行");
        return restTemplate.getForObject(url, JSONObject.class);
    }
}
