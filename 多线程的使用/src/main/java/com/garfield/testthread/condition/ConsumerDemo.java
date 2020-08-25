package com.garfield.testthread.condition;

import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * @author jingliyuan
 * @date 2020/8/24
 */
public class ConsumerDemo {
    public static void main(String[] args) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(5,10 ,5 , TimeUnit.SECONDS ,new LinkedBlockingDeque<>());
        threadPoolExecutor.execute(() ->{
            while (ProducerDemo.getResource().size() == 0){

            }
        });
    }
}
