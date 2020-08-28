package com.garfield.testthread.queue;

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

    public static void main(String[] args) {
        float num = -1.5f;
        float v = num % 1;
        System.out.println(v);
        if(num % 1 == 0){
            System.out.println("aa");
        }else{
            System.out.println("bb");
        }
    }

}
