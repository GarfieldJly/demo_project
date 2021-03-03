package com.garfield.combat;

import java.util.concurrent.TimeUnit;

public class Test {
    private static Object lock = new Object();

    public static void main(String[] args) {
        new Thread(() ->{
            test1();
        }).start();
        new Thread(() ->{
            test2();
        }).start();
    }
    public static void test1(){
        try {
            TimeUnit.SECONDS.sleep(2);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        synchronized (lock){
            System.out.println("aaa");
            synchronized (Test.class){

            }
        }
    }

    public  static void test2(){
        synchronized (Test.class){
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
