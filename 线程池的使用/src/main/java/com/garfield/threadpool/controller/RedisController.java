package com.garfield.threadpool.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.data.redis.connection.RedisConnection;
import org.springframework.data.redis.connection.StringRedisConnection;
import org.springframework.data.redis.core.RedisCallback;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.data.redis.serializer.StringRedisSerializer;
import org.springframework.util.StopWatch;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.*;
import java.util.stream.Collectors;

/**
 * @author jingliyuan
 * @date 2020/8/17
 * 假设有一个方法是调用redis查询一条数据的，改成用线程池批量查询然后返回给每个客户端
 * 先写原始的方法，一个请求查询一次redis
 */
@RestController
@RequestMapping("/test")
@Slf4j
public class RedisController {
    @Autowired
    private StringRedisTemplate redisTemplate;

    @GetMapping(value = "/getName")
    public String getName(){
        ValueOperations<String, String> redisString = redisTemplate.opsForValue();
        return (String) redisString.get("name");
    }
    @GetMapping(value = "/setName")
    public void setName(){
        ValueOperations<String, String> redisString = redisTemplate.opsForValue();
        redisString.set("name","garfield1");
        redisString.set("name1","garfield11");
        redisString.set("name2","garfield22");
        redisString.set("name3","garfield33");
        redisString.set("name4","garfield44");
        redisString.set("name5","garfield55");
    }

    @GetMapping(value = "/getBatchName")
    public List<String> getBatchName(){
        StopWatch stopWatch = new StopWatch();
        stopWatch.start();
        List<String> resultList = new ArrayList<>();
        List<String> keyList = new ArrayList<>();
        keyList.add("name1");
        keyList.add("name2");
        keyList.add("name3");
        keyList.add("name4");
        keyList.add("name5");
        ValueOperations<String, String> redisString = redisTemplate.opsForValue();
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(5,10 ,5 ,TimeUnit.SECONDS ,new LinkedBlockingQueue<Runnable>());
       for (String key : keyList){
           Future<?> submit = threadPoolExecutor.submit(() -> {
               resultList.add(redisString.get(key));
           });
           try {
               submit.get();
           } catch (InterruptedException e) {
               e.printStackTrace();
           } catch (ExecutionException e) {
               e.printStackTrace();
           }
       }
       stopWatch.stop();
       log.info("方法执行时间："+stopWatch.getTotalTimeMillis());
       return resultList;
    }

    @GetMapping(value = "/getBatchName2")
    public List<String> getBatchName2(){
        StopWatch stopWatch = new StopWatch();
        stopWatch.start();
        List<String> resultList = new ArrayList<>();
        List<String> keyList = new ArrayList<>();
        keyList.add("name1");
        keyList.add("name2");
        keyList.add("name3");
        keyList.add("name4");
        keyList.add("name5");

        List<Object> objects = redisTemplate.executePipelined(new RedisCallback<String>() {
            @Override
            public String doInRedis(RedisConnection redisConnection) throws DataAccessException {
                StringRedisConnection stringRedisConnection = (StringRedisConnection) redisConnection;
                for (String key : keyList) {
                    stringRedisConnection.get(key);
                }
                return null;
            }
        });

        resultList = objects.stream().map(val -> String.valueOf(val)).collect(Collectors.toList());
        stopWatch.stop();
        log.info("批量执行时间："+stopWatch.getTotalTimeMillis());
        return resultList;
    }

    @GetMapping(value = "/getBatchName3/{name}")
    public String getBatchName3(@PathVariable String name){
        StopWatch stopWatch = new StopWatch();
        stopWatch.start();
        List<String> keyList = new ArrayList<>();
        keyList.add("name1");
        keyList.add("name2");
        keyList.add("name3");
        keyList.add("name4");
        keyList.add("name5");

        Map<String,Future<?>> futureMap = new HashMap();
        ValueOperations<String, String> redisString = redisTemplate.opsForValue();
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(5,10 ,5 ,TimeUnit.SECONDS ,new LinkedBlockingQueue<Runnable>());
        for (String key : keyList){

            Future<?> submit = threadPoolExecutor.submit(() -> {
                redisString.get(key);
            });
            CompletableFuture completableFuture = new CompletableFuture<>();
            completableFuture.complete(submit);
            futureMap.put(key,submit);

        }

        try {
            return (String) futureMap.get(name).get();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
        return "";
    }

    /**
     * 用生产者和消费者的方式，创建一个本地的队列，请求的时候放到队列，消费者是一个定时的线程池，
     * 每隔10s从队列中取查询条件批量从redis中查询，然后返回
     */
    private LinkedBlockingQueue<Runnable> linkedBlockingQueue = new LinkedBlockingQueue<>();
    public void testProducer(String key){
        try {
            linkedBlockingQueue.put(new Runnable() {
                @Override
                public void run() {
                    redisTemplate.opsForValue().get(key);
                }
            });
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    /**
     *  LinkedBlockingQueue
     * 定时的线程池负责从这里取查询的条件
     * 然后批量查询
     */
    public String testConsumer(){
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(5);
        try {
            Runnable runnable = linkedBlockingQueue.take();
            ScheduledFuture<?> scheduledFuture = scheduledThreadPoolExecutor.scheduleAtFixedRate(runnable, 1, 2, TimeUnit.SECONDS);
            String result = (String) scheduledFuture.get();
            return result;
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }
        return null;

    }

    /**
     * 写定时的线程池从队列里取查询条件批量查询
     */
}
