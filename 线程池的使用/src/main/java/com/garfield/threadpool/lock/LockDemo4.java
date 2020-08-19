package com.garfield.threadpool.lock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author jingliyuan
 * @date 2020/8/18
 *两个线程去获取锁，第二个线程一段时间获取不到锁后中断
 */
public class LockDemo4 {


    public static void main(String[] args) {

        Lock lock = new ReentrantLock();
        Thread thread1 = new Thread(() ->{
            lock.lock();
            System.out.println("thread1获取到锁");
            try {
                Thread.sleep(10000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        Thread thread2 = new Thread(() ->{
            try {
                lock.lockInterruptibly();
                System.out.println("thread2获取到锁");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        });

        thread1.start();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        thread2.start();

    }
}
