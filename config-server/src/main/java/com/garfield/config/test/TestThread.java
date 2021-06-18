package com.garfield.config.test;

import java.util.concurrent.TimeUnit;

/**
 * TestThread
 *
 * @author zhaojian
 * @date 2021/5/17
 */
public class TestThread {
    private static Object lock = new Object();

//    public static void main(String[] args) {
//        new Thread(() ->{
//            test1();
//        }).start();
//        new Thread(() ->{
//            test2();
//        }).start();
//    }
    public static void test1(){
        try {
            TimeUnit.SECONDS.sleep(2);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        synchronized (lock){
            System.out.println("aaa");
            synchronized (TestThread.class){

            }
        }
    }

    public  static void test2(){
        synchronized (TestThread.class){
            System.out.println("bbb");
            try {
                TimeUnit.SECONDS.sleep(3);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            synchronized (lock){

            }
        }
    }
}
