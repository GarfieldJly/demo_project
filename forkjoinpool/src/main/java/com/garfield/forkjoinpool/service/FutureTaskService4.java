package com.garfield.forkjoinpool.service;

import com.alibaba.fastjson.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * @author jingliyuan
 * @date 2020/8/29
 * 改成FutureTask 异步执行的结果，并发的http请求
 * 总的执行时间，取决于执行最慢的逻辑
 */
@Service
public class FutureTaskService4 {
    @Autowired
    private RestTemplate  restTemplate;

    //结果集
    private ArrayList<JSONObject> resultList = new ArrayList<>();

    /**
     * 初始化“我的”页面数据
     */
    public void init() throws InterruptedException, ExecutionException {

        FutureTask futureTask1 = new FutureTask<JSONObject>(() ->{
            JSONObject result = getResult("http://localhost:8090/forkjoinpool/getName");
            return result;
        });

        FutureTask futureTask2 = new FutureTask<JSONObject>(() ->{
            JSONObject result = getResult("http://localhost:8090/forkjoinpool/getBalance");
            return result;
        });

        new Thread(futureTask1).start();
        new Thread(futureTask2).start();

        JSONObject jsonObject1 = (JSONObject) futureTask1.get();
        JSONObject jsonObject2 = (JSONObject) futureTask2.get();
        System.out.println("futureTask1的结果是:"+jsonObject1);
        System.out.println("futureTask2的结果是:"+jsonObject2);
    }

    public JSONObject getResult(String url){
        System.out.println(Thread.currentThread() + "开始执行");
        return restTemplate.getForObject(url, JSONObject.class);
    }
}
