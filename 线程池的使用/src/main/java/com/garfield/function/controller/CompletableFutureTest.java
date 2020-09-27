package com.garfield.function.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.data.redis.core.RedisOperations;
import org.springframework.data.redis.core.SessionCallback;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

@Controller
public class CompletableFutureTest {
    //请求的队列
    LinkedBlockingQueue<Request> queue = new LinkedBlockingQueue<>();
    @Autowired
    private StringRedisTemplate stringRedisTemplate;

    @PostConstruct
    public void response(){
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1);
        scheduledThreadPoolExecutor.scheduleAtFixedRate(new Runnable() {
            @Override
            public void run() {
                List<Request> requestList = new ArrayList();
                if(queue.size() > 0){
                    for (int i = 0; i < queue.size(); i++) {
                        requestList.add(queue.poll());
                    }
                    List<String> keyList = new ArrayList<>();
                    requestList.forEach(x->{
                        String movieId = x.getMovieId();
                        keyList.add(movieId);
                    });
                    System.out.println("批量查询"+keyList.size()+"条");
                    //从redis里批量查询
                    List<Object> list = stringRedisTemplate.executePipelined(new SessionCallback<String>() {
                        @Override
                        public String execute(RedisOperations redisOperations) throws DataAccessException {
                            keyList.forEach(k-> redisOperations.opsForValue().get(k));
                            return null;
                        }
                    });
                    if(CollectionUtils.isEmpty(list)){
                        return;
                    }
                    for (int i = 0; i < requestList.size(); i++) {
                        Request request = requestList.get(i);
                        String result = (String) list.get(i);
                        request.getCompletableFuture().complete(result);
                    }
                }
            }
        },0,10, TimeUnit.MILLISECONDS);
    }

    @GetMapping("/getAnimalName")
    @ResponseBody
    public String getAnimalName(@RequestParam(name = "param") String param){
        try {
            Request request = new Request();
            request.setMovieId(param);
            CompletableFuture<String> completableFuture = new CompletableFuture<>();
            request.setCompletableFuture(completableFuture);
            queue.offer(request);
            return completableFuture.get();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
        return null;
    }
}

/**
 * 封装的请求类
 */
class Request{
    private String movieId;
    private CompletableFuture<String> completableFuture;

    public String getMovieId() {
        return movieId;
    }

    public void setMovieId(String movieId) {
        this.movieId = movieId;
    }

    public CompletableFuture<String> getCompletableFuture() {
        return completableFuture;
    }

    public void setCompletableFuture(CompletableFuture<String> completableFuture) {
        this.completableFuture = completableFuture;
    }
}
