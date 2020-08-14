package com.garfield.testthread.lock;

/**
 * @author jingliyuan
 * @date 2020/8/14
 * 锁分为类锁和对象锁
 * 类锁是 class，只有一个
 * 对象锁是有多个
 */
public class TestLock1 {
    int count = 0;
    private synchronized void add(){
        while (count < 10000){
            count++;
            System.out.println(count);
        }
    }

    private void test1(){
        new Thread(() ->{
            TestLock1 testLock1 = new TestLock1();
            testLock1.add();
        }).start();

        new Thread(() ->{
            TestLock1 testLock1 = new TestLock1();
            testLock1.add();
        }).start();

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("5秒后count的值:"+count);
    }

    public static void main(String[] args) {
        TestLock1 testLock1 = new TestLock1();
        testLock1.test1();
    }
}
