package com.garfield.threadpool.lock;

import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 * @author jingliyuan
 * @date 2020/8/18
 * ReentrantReadWriteLock 读写锁，多读少写
 */
public class LockDemo5 {
    private ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();

    private void testRead(Thread thread){
        reentrantReadWriteLock.readLock().lock();
        long startTime = System.currentTimeMillis();
        while (System.currentTimeMillis() - startTime < 1){
            System.out.println(thread.getName() + "开始读取数据");
        }
        reentrantReadWriteLock.readLock().unlock();
        System.out.println(thread.getName() + "结束读取数据");
    }

    private void testWrite(Thread thread){
        reentrantReadWriteLock.writeLock().lock();
        long startTime = System.currentTimeMillis();
        while (System.currentTimeMillis() - startTime < 1){
            System.out.println(thread.getName() + "开始写数据");
        }
        reentrantReadWriteLock.writeLock().unlock();
        System.out.println(thread.getName() + "结束写数据");
    }

    public static void main(String[] args) {
        LockDemo5 lockDemo5 = new LockDemo5();
        Thread thread1 = new Thread(() ->{
            lockDemo5.testRead(Thread.currentThread());
        });
        Thread thread2 = new Thread(() ->{
            lockDemo5.testRead(Thread.currentThread());
        });
        Thread thread3 = new Thread(() ->{
            lockDemo5.testWrite(Thread.currentThread());
        });
        //执行结果：
        //thread0 和thread1 交叉读数据，读完数据后thread2开始写数据
        thread1.start();
        thread2.start();
        thread3.start();

    }


}
