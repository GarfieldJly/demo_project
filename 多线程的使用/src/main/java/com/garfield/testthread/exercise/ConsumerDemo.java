package com.garfield.testthread.exercise;

import java.util.concurrent.LinkedBlockingQueue;

/**
 * @author jingliyuan
 * @date 2020/8/26
 * 消费者从客户队列,窗口队列取出客户,加入到任务中运行.如果没有就阻塞
 */
public class ConsumerDemo {

    public static void main(String[] args) {
        LinkedBlockingQueue<Window> windowQueue = ProducerDemo.windowQueue;
        LinkedBlockingQueue<Customer> customerQueue = ProducerDemo.customerQueue;
        while (windowQueue.size() == 0) {
            Thread.yield();
        }
        for (int i = 0; i < windowQueue.size(); i++) {
            Window window = windowQueue.poll();
            Customer customer = window.getCustomer();

        }
    }
}
