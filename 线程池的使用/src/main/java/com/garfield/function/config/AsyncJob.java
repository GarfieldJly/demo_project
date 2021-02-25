package com.garfield.function.config;

import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.AsyncResult;
import org.springframework.stereotype.Component;

import java.util.concurrent.Future;

/**
 * @author jingliyuan
 * @date 2021/2/2
 * 异步执行任务
 */
@Component
public class AsyncJob {

    /**
     * 没有返回值的异步方法
     */
    @Async
    public void printNum(){
        for (int i = 0; i < 20; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("i的值是:"+i);
        }
    }

    /**
     * 有返回值的异步方法
     */
    public Future<String> getNumResult(){
        for (int i = 0; i < 5; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("i的值是:"+i);
        }
        return new AsyncResult<String>("打印完成") ;
    }
}
