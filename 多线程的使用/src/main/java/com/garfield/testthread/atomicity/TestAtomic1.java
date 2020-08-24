package com.garfield.testthread.atomicity;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author jingliyuan
 * @date 2020/8/13
 *  两个线程都修改变量 i 的值
 */
public class TestAtomic1 {


    /**
     * 两个线程都修改变量 count 的值，看最后count的值是否符合预期
     * 结果可能为10001 ，不正确
     */
    volatile int count1 = 0;
    private void test1() throws InterruptedException {
        for (int i = 0; i < 2; i++) {
            new Thread(() ->{
                for (int j = 0; j < 10000; j++) {
                    addCount1();
                }
            }).start();
        }
        Thread.sleep(2000);
        System.out.println("count1 的值是："+count1);
    }

    private void addCount1(){
        count1++;
    }

    /**
     * 两个线程都修改变量 count 的值，看最后count的值是否符合预期
     * 结果可能为10001 ，不正确
     * 使用volatile修饰value时只能保证可见性，getfield读取到的一定是最新值，但不能保证原子性
     */
    volatile int count2;
    private void addCount2(){
        count2++;
    }
    private void test2() throws InterruptedException {
        for (int i = 0; i < 2; i++) {
            new Thread(() ->{
                for (int j = 0; j < 10000; j++) {
                    addCount2();
                }
            }).start();
        }
        Thread.sleep(2000);
        System.out.println("count 的值是："+count2);
    }

    /**
     * 使用synchronized 来实现
     */
    int count3;
    private void test3() throws InterruptedException {
        for (int i = 0; i < 2; i++) {
            new Thread(() ->{
                for (int j = 0; j < 10000; j++) {
                    synchronized (this){
                        count3++;
                    }
                }
            }).start();
        }
        Thread.sleep(2000);
        System.out.println("count3 的值是："+count3);
    }

    /**
     * 使用锁的方法 Lock
     */
    int count4;
    private void test4() throws InterruptedException {
        Lock lock = new ReentrantLock();
        for (int i = 0; i < 2; i++) {
            new Thread(() ->{
                for (int j = 0; j < 10000; j++) {
                    lock.lock();
                        count4++;
                    lock.unlock();
                }
            }).start();
        }
        Thread.sleep(2000);
        System.out.println("count4 的值是："+count4);
    }

    /**
     * 使用 JUC里的原子操作类
     */
    AtomicInteger count5 = new AtomicInteger();
    private void test5() throws InterruptedException {
        for (int i = 0; i < 2; i++) {
            new Thread(() ->{
                for (int j = 0; j < 10000; j++) {
                    count5.incrementAndGet();
                }
            }).start();
        }
        Thread.sleep(2000);
        System.out.println("count5 的值是："+count5);
    }

    public static void main(String[] args) throws InterruptedException {
        TestAtomic1 testAtomic = new TestAtomic1();
//        testAtomic.test1();
//        testAtomic.test2();
        testAtomic.test3();
        testAtomic.test4();
        testAtomic.test5();

    }
}
