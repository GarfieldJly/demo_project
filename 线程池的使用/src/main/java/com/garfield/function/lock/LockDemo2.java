package com.garfield.function.lock;

import java.util.concurrent.locks.ReentrantLock;

/**
 * @author jingliyuan
 * @date 2020/8/18
 * ReentrantLock的可重入就是同一个lock，锁多次
 */
public class LockDemo2 {
    private ReentrantLock reentrantLock = new ReentrantLock();
    private void test1(){
        reentrantLock.lock();
        System.out.println("执行test1******");
        reentrantLock.unlock();
    }

    private void test2(){
        reentrantLock.lock();
        test1();
        System.out.println("执行test2******");
        reentrantLock.unlock();
    }

    public static void main(String[] args) {
        //执行test1******
        //执行test2******
        LockDemo2 lockDemo2 = new LockDemo2();
        lockDemo2.test2();
    }


}
