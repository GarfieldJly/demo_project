package com.garfield.forkjoinpool.bean;

import com.alibaba.fastjson.JSONObject;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ForkJoinTask;
import java.util.concurrent.RecursiveTask;

/**
 * @author jingliyuan
 * @date 2020/8/29
 */
public class HttpRequestBo extends RecursiveTask<JSONObject> {
    private ArrayList<String> urlList;
    private int start;
    private int end;
    private RestTemplate restTemplate;

    public HttpRequestBo(ArrayList<String> urlList, int start, int end, RestTemplate restTemplate) {
        this.urlList = urlList;
        this.start = start;
        this.end = end;
        this.restTemplate = restTemplate;
    }

    @Override
    protected JSONObject compute() {
        if (end - start == 0) {
            //直接执行
            System.out.println(Thread.currentThread() + "开始执行");
            String url = urlList.get(start);
            return restTemplate.getForObject(url, JSONObject.class);
        }
        JSONObject result = new JSONObject();
        int x = (start + end) / 2;
        HttpRequestBo httpRequestBo1 = new HttpRequestBo(urlList, start, x, restTemplate);
        ForkJoinTask<JSONObject> fork1 = httpRequestBo1.fork();

        HttpRequestBo httpRequestBo2 = new HttpRequestBo(urlList, x + 1, end, restTemplate);
        ForkJoinTask<JSONObject> fork2 = httpRequestBo2.fork();

            JSONObject jsonObject1 = fork1.join();
            JSONObject jsonObject2 = fork2.join();

            result.putAll(jsonObject1);
            result.putAll(jsonObject2);


        return result;

    }
}
