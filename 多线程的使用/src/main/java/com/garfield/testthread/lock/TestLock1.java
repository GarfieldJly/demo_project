package com.garfield.testthread.lock;

/**
 * @author jingliyuan
 * @date 2020/8/14
 * 锁分为类锁和对象锁
 * 类锁是 class，只有一个
 * 对象锁是有多个
 */
public class TestLock1 {

    /**
     * lock1() 和 lock()2 用的是同一把锁
     */
    private  void lock1(){
        synchronized (this){
            System.out.println("lock1 执行");
            lock2();
        }
    }

    private void lock2(){
        synchronized (this){
            System.out.println("lock2 执行");
        }
    }

    private void lock3(){
        synchronized (this){
            System.out.println("lock3 执行");
            lock4();
        }
    }
    Integer count = 0;
    private void lock4(){
        synchronized (count){
            System.out.println("lock4 执行");
        }
    }


    public static void main(String[] args) {
        TestLock1 testLock1 = new TestLock1();
        testLock1.lock1();
    }
}
