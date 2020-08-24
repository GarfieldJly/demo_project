package com.garfield.function.aqs;

import java.util.concurrent.locks.Lock;

/**
 * @author jingliyuan
 * @date 2020/8/20
 */
public class ReentrantReadWriteLockDemo1 {

    private CustomReentrantReadWriteLock customReentrantReadWriteLock = new CustomReentrantReadWriteLock();

    private void testRead(Thread thread){
        customReentrantReadWriteLock.readLock().lock();
        long startTime = System.currentTimeMillis();
        while (System.currentTimeMillis() - startTime < 1){
            System.out.println(thread.getName() + "开始读取数据");
        }
        customReentrantReadWriteLock.readLock().unlock();
        System.out.println(thread.getName() + "结束读取数据");
    }

    private void testWrite(Thread thread){
        customReentrantReadWriteLock.writeLock().lock();
        long startTime = System.currentTimeMillis();
        while (System.currentTimeMillis() - startTime < 1){
            System.out.println(thread.getName() + "开始写数据");
        }
        customReentrantReadWriteLock.writeLock().unlock();
        System.out.println(thread.getName() + "结束写数据");
    }

    public static void main(String[] args) {
        ReentrantReadWriteLockDemo1 readWriteLockDemo1 = new ReentrantReadWriteLockDemo1();
        Thread thread1 = new Thread(() ->{
            readWriteLockDemo1.testRead(Thread.currentThread());
        });
        Thread thread2 = new Thread(() ->{
            readWriteLockDemo1.testRead(Thread.currentThread());
        });
        Thread thread3 = new Thread(() ->{
            readWriteLockDemo1.testWrite(Thread.currentThread());
        });
        //执行结果：
        //thread0 和thread1 交叉读数据，读完数据后thread2开始写数据
        thread1.start();
        thread2.start();
        thread3.start();

    }

}
