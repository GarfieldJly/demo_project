package com.garfield.threadpool.lock;

import com.garfield.threadpool.aqs.CustomLock;

import java.util.concurrent.locks.Lock;

/**
 * @author jingliyuan
 * @date 2020/8/18
 * 3个线程每个线程自增10000次
 */
public class LockDemo1 {
    static volatile int count = 0;
//    private Lock lock = new ReentrantLock();
    //换成自定义的锁
//    private Lock lock = new GarfieldLock();
    //换成AQS自定义锁
    private Lock lock = new CustomLock();

    private void add(){
        lock.lock();
        count++;
        lock.unlock();
    }

    public static void main(String[] args) {
        LockDemo1 lockDemo1 = new LockDemo1();
        for (int i = 0; i < 3; i++) {
            new Thread(() ->{
                for (int j = 0; j < 10000; j++) {
                    lockDemo1.add();
                }
            }).start();
        }
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("count的值是:"+count);
    }
}
