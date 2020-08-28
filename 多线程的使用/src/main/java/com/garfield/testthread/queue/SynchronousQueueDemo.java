package com.garfield.testthread.queue;

import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.TimeUnit;

/**
 * @author jingliyuan
 * @date 2020/8/27
 * 这是一个神奇的队列， 因为他不存数据。 手把手的交互数据
 */
public class SynchronousQueueDemo {
    public static void main(String[] args) {
        SynchronousQueue<String> synchronousQueue = new SynchronousQueue<>();
        synchronousQueue.offer("aa");
        //取不出来
        System.out.println(synchronousQueue.poll());

        new Thread(() ->{
            try {
                synchronousQueue.put("garfield");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();

        new Thread(() ->{
            try {
                TimeUnit.SECONDS.sleep(1);
                System.out.println(synchronousQueue.take());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();

    }
}
