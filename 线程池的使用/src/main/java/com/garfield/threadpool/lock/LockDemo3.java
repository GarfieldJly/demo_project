package com.garfield.threadpool.lock;

import java.util.concurrent.locks.ReentrantLock;

/**
 * @author jingliyuan
 * @date 2020/8/18
 * ReentrantLock 的加锁次数 = 解锁次数
 */
public class LockDemo3 {
    private static ReentrantLock reentrantLock = new ReentrantLock();

    private void test1() {
        reentrantLock.lock();
        System.out.println("执行test1******");
        reentrantLock.unlock();
    }

    private void test2() {
        reentrantLock.lock();
        test1();
        System.out.println("执行test2******");
        //少写一个unlock,看执行结果
//        reentrantLock.unlock();
    }

    public static void main(String[] args) {
        //执行test1******
        //执行test2******
        //然后程序卡住，因为test2（）里没有解锁，会一直等待
        LockDemo3 lockDemo3 = new LockDemo3();
        lockDemo3.test2();
        new Thread(() -> {
            reentrantLock.lock();
            System.out.println("在子线程里执行");
            reentrantLock.unlock();
        }).start();
    }

}

