package com.garfield.testthread.exercise;

import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.LockSupport;

/**
 * @author jingliyuan
 * @date 2020/8/26
 * 消费者从客户队列,窗口队列取出客户,加入到任务中运行.如果没有就阻塞
 */
public class ConsumerDemo implements Runnable{
    ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(5,10,5, TimeUnit.SECONDS,new LinkedBlockingDeque<>());
    @Override
    public void run() {
        while (true){
            LinkedBlockingQueue<Window> windowQueue = DispatchDemo.windowQueue;
            LinkedBlockingQueue<Customer> customerQueue = DispatchDemo.customerQueue;
            //若都为空，则阻塞，等待
            while (windowQueue.size() == 0 || customerQueue.size() ==0) {
                LockSupport.park();
            }

            Window window = windowQueue.poll();
            Customer customer = customerQueue.poll();
            window.setCustomer(customer);
            window.setCustomerThread(DispatchDemo.customerThead);
            System.out.println(customer.getCustomerCode() + "号客户去" + window.getWindowCode() + "号窗口办理业务");
            //窗口开始为该客户服务
            threadPoolExecutor.submit(window);
        }

    }
}
