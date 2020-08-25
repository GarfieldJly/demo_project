package com.garfield.testthread.condition;

import java.util.concurrent.*;

/**
 * @author jingliyuan
 * @date 2020/8/24
 * 消费者消费时如果没有要阻塞，生产者生产后要唤醒消费者，生产者生产时如果满了要阻塞，消费者消费后要唤醒生产者
 */
public class ProducerDemo {
    private static ConcurrentHashMap<Integer,Object> resource = new ConcurrentHashMap<>();
    private static final Integer SIZE = 5;
    public static void main(String[] args) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(5,10 ,5 ,TimeUnit.SECONDS ,new LinkedBlockingDeque<>());
        threadPoolExecutor.execute(() ->{
            if(resource.size() < 5){
                resource.put(1,"a");
            }
        });
    }

    public static ConcurrentHashMap<Integer, Object> getResource() {
        return resource;
    }

    public static void setResource(ConcurrentHashMap<Integer, Object> resource) {
        ProducerDemo.resource = resource;
    }
}
