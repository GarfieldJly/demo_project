package com.garfield.testthread.state;

/**
 * @author jingliyuan
 * @date 2020/8/7
 * 线程的状态(图: resources/线程的状态.png)
 */
public class TestThreadState {
    public static void main(String[] args) throws InterruptedException {
//        thread1 执行start方法之前的状态:NEW
//        thread1 执行run 方法的状态:RUNNABLE
//        thread1 执行start方法之后的状态:TERMINATED
        Thread thread1 = new Thread(() -> System.out.println("thread1 执行run 方法的状态:"+Thread.currentThread().getState()));
        System.out.println("thread1 执行start方法之前的状态:"+thread1.getState());
        thread1.start();
        Thread.sleep(2000);
        System.out.println("thread1 执行start方法之后的状态:"+thread1.getState());
        System.out.println("======================================");

        Thread thread2 = new Thread(() ->{
            System.out.println("thread2 sleep 之前的状态:"+Thread.currentThread().getState());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("thread2 sleep 之后的状态:"+Thread.currentThread().getState());
        });
        System.out.println("thread2 执行start方法之前的状态:"+thread2.getState());
        thread2.start();
        Thread.sleep(200);
        System.out.println("thread2 执行start方法之后的状态:"+thread2.getState());
        Thread.sleep(3000);
        System.out.println("休眠3S后thread2的状态:"+thread2.getState());



    }
}
