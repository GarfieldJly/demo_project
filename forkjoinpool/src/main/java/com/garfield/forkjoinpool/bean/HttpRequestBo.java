package com.garfield.forkjoinpool.bean;

import com.alibaba.fastjson.JSONObject;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.concurrent.ForkJoinPool;
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
        if(end - start == 0){
            //直接执行
            String url = urlList.get(start);
            return restTemplate.getForObject(url, JSONObject.class);
        }
        int x = (start + end) / 2;
        HttpRequestBo httpRequestBo = new HttpRequestBo(urlList,start,end,restTemplate);
        httpRequestBo.fork();




    }
}
