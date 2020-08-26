package com.garfield.testthread.exercise;

import java.util.Random;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author jingliyuan
 * @date 2020/8/26
 */
public class DispathcDemo {
    //客户队列
    public static LinkedBlockingQueue<Customer> customerQueue = new LinkedBlockingQueue();
    //窗口队列
    public static LinkedBlockingQueue<Window> windowQueue = new LinkedBlockingQueue();

    static Lock producerLock = new ReentrantLock();
    public static Condition producerCondition = producerLock.newCondition();

    static Lock consumerLock = new ReentrantLock();
    public static Condition consumerCondition = consumerLock.newCondition();

    static {
        //初始化窗口队列
        for (int i = 1; i <= 5; i++) {
            Window window = new Window(i);
            try {
                windowQueue.put(window);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void dispatch()  {


    }
}
