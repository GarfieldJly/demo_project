package com.garfield.testthread.share;

import java.util.concurrent.locks.LockSupport;

/**
 * @author jingliyuan
 * @date 2020/8/10
 * 创建三个线程，交替循环从1打印到100
 * 1，判断条件自增打印
 * 2，通知其他线程
 * 3，自己进入等待状态
 */
public class TestCount {
    private static int count = 0;
    private static String lock1 = "Lock1";
    private static String lock2 = "Lock2";
    private static String lock3 = "Lock3";
    public static void main(String[] args) throws InterruptedException {
        Thread thread1 = new Thread(() -> {
            synchronized (lock1){
                while (count < 100){
                    count++;
                    try {
                        System.out.println("thread1 的count值:"+count);
                        synchronized (lock2){
                            lock2.notify();
                        }
                        lock1.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                synchronized (lock2){
                    lock2.notify();
                }
            }
        });

        Thread thread2 = new Thread(() -> {
            synchronized (lock2){
                try {
                    lock2.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                while (count < 100){
                    count++;
                    try {
                        System.out.println("thread2 的count值:"+count);
                        synchronized (lock3){
                            lock3.notify();
                        }
                        lock2.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                }
                synchronized (lock3){
                    lock3.notify();
                }
            }
        });

        Thread thread3 = new Thread(() -> {
            synchronized (lock3){
                try {
                    lock3.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                while (count < 100){
                    count++;
                    try {
                        System.out.println("thread3 的count值:"+count);
                        synchronized (lock1){
                            lock1.notify();
                        }
                        lock3.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                synchronized (lock1){
                    lock1.notify();
                }
            }
        });

//        thread1.start();
//        thread2.start();
//        thread3.start();

        testParkAndUnPark();

    }

    private static Thread thread1,thread2,thread3;

    /**
     * 创建三个线程，交替循环从1打印到100，使用park()和unpark()，不在同步代码块里不会死锁
     */
    private static void testParkAndUnPark(){
        thread1 = new Thread(() -> {
            while (count < 100){
                count++;
                System.out.println("thread1 的count值:"+count);
                LockSupport.unpark(thread2);
                LockSupport.park();
            }
            LockSupport.unpark(thread2);
        });
        thread2 = new Thread(() -> {
            LockSupport.park();
            while (count < 100){
                count++;
                System.out.println("thread2 的count值:"+count);
                LockSupport.unpark(thread3);
                LockSupport.park();
            }
            LockSupport.unpark(thread3);
        });
        thread3 = new Thread(() -> {
            LockSupport.park();
            while (count < 100){
                count++;
                System.out.println("thread3 的count值:"+count);
                LockSupport.unpark(thread1);
                LockSupport.park();
            }
            LockSupport.unpark(thread1);
        });

        thread1.start();
        thread2.start();
        thread3.start();
    }
}
