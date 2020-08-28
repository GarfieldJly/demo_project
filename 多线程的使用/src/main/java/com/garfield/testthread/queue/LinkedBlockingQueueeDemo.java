package com.garfield.testthread.queue;

import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author jingliyuan
 * @date 2020/8/27
 */
public class LinkedBlockingQueueeDemo {
    private static AtomicInteger atomicInteger = new AtomicInteger(1);
    public static void main(String[] args) {
        // 它是基于链表的队列，此队列按 FIFO（先进先出）排序元素。
        // 如果有阻塞需求，用这个。类似生产者消费者场景
        LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue(3);
        new Thread(() ->{
            for (int i = 0; i < 6; i++) {
                linkedBlockingQueue.offer("对象" + atomicInteger.incrementAndGet() );
            }

        }).start();

        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        new Thread(() ->{
            while (true){
                Object poll = linkedBlockingQueue.poll();
                System.out.println("取出的元素:" + poll);
                try {
                    TimeUnit.SECONDS.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();


    }
}
