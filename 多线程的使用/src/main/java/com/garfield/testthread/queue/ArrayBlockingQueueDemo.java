package com.garfield.testthread.queue;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.TimeUnit;

/**
 * @author jingliyuan
 * @date 2020/8/27
 * ArrayBlockingQueue在构造时需要指定容量， 并可以选择是否需要公平性，如果公平参数被设置true，
 * 等待时间最长的线程会优先得到处理（其实就是通过将ReentrantLock设置为true来 达到这种公平性的：即等待时间最长的线程会先操作）。
 * 通常，公平性会使你在性能上付出代价，只有在的确非常需要的时候再使用它。
 * 它是基于数组的阻塞循环队 列，此队列按 FIFO（先进先出）原则对元素进行排序。
 */
public class ArrayBlockingQueueDemo {
    //阻塞，非公平锁，实现BlockingQueue接口，里面有 put()和take()阻塞的方法
    //它是基于数组的阻塞循环队列， 此队列按 FIFO（先进先出）原则对元素进行排序。
    private static ArrayBlockingQueue<String> arrayBlockingQueue = new ArrayBlockingQueue<>(3, false);

    public void getObject() {
        new Thread(() -> {
            while (true) {
                String poll = arrayBlockingQueue.poll();
                System.out.println("取出的元素为" + poll);
                try {
                    TimeUnit.SECONDS.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();
    }

    // 往队列里添加六个元素，再依次输出
    public static void main(String[] args) {
        new Thread(() -> {
            for (int i = 1; i <= 6; i++) {
                //非阻塞
//            arrayBlockingQueue.offer("对象" + i);
                try {
                    //如果队列满了，则阻塞
                    arrayBlockingQueue.put("对象" + i);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("队列添加元素: 对象" + i);
            }
        }).start();

        for (int i = 1; i <= 6; i++) {
            new Thread(() -> {
                //非阻塞
//            arrayBlockingQueue.offer("对象" + i);
                try {
                    //如果队列满了，则阻塞
                    arrayBlockingQueue.put("对象" + Thread.currentThread());
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("队列添加元素: 对象" + Thread.currentThread());
            }).start();
        }

        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        ArrayBlockingQueueDemo queueDemo1 = new ArrayBlockingQueueDemo();
        queueDemo1.getObject();

    }
}
