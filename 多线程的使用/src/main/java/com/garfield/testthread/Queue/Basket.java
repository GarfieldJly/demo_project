package com.garfield.testthread.Queue;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

/**
 * @author jingliyuan
 * @date 2020/8/26
 */
public class Basket {
    // 篮子，能够容纳3个苹果
    BlockingQueue<String> basket = new ArrayBlockingQueue<String>(3);

    public void producer() throws InterruptedException {
        basket.put("添加苹果");
    }

    public String customer() throws InterruptedException {
        return basket.take();

    }

    public int getAppleNumber(){
        return basket.size();
    }

}
