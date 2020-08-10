package com.garfield.testthread.share;

import java.util.concurrent.locks.LockSupport;

public class ThreadCommunication {
    private Object baozhi ;

    /**
     * 使用 suspend() 和 resume() 时，容易死锁
     */
    private void testSuspendAndResume() throws InterruptedException {
        Thread  consumerThread = new Thread(() ->{
            while (baozhi == null){
                System.out.println("没有包子，等待");
                Thread.currentThread().suspend();
            }
            System.out.println("买完包子，回家");

        });
        consumerThread.start();
        Thread.sleep(500);
        baozhi = new Object();
        System.out.println("生产包子");
        consumerThread.resume();
    }

    /**
     * 使用 suspend() 和 resume(),在同步代码块里，不会释放锁
     */
    private void testSuspendAndResumeError1() throws InterruptedException {
        Thread  consumerThread = new Thread(() ->{
            synchronized (ThreadCommunication.class){
                while (baozhi == null){
                    System.out.println("没有包子，等待");
                    Thread.currentThread().suspend();
                }
                System.out.println("买完包子，回家");
            }

        });
        consumerThread.start();
        Thread.sleep(500);
        baozhi = new Object();
        System.out.println("生产包子");
        synchronized (ThreadCommunication.class) {
            consumerThread.resume();
        }
    }

    /**
     * 使用 suspend() 和 resume(),resume()方法先于suspend()执行，会死锁
     */
    private void testSuspendAndResumeError2() throws InterruptedException {
        Thread  consumerThread = new Thread(() ->{
            while (baozhi == null){
                System.out.println("没有包子，等待");
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                Thread.currentThread().suspend();
            }
            System.out.println("买完包子，回家");
        });
        consumerThread.start();
        Thread.sleep(500);
        baozhi = new Object();
        System.out.println("生产包子");
        Thread.sleep(1000);
        consumerThread.resume();
    }

    /**
     *  wait()和 nofity()、notifyAll()，是Object对象的方法，要在同步代码块中执行
     */
    private void testWaitAndNotify() throws InterruptedException {
        Thread  consumerThread = new Thread(() ->{
            synchronized (this){
                while (baozhi == null){
                    System.out.println("没有包子，等待");
                    try {
                        this.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println("买完包子，回家");
            }
        });
        consumerThread.start();
        Thread.sleep(500);
        baozhi = new Object();
        System.out.println("生产包子");
        synchronized (this){
            this.notify();
        }
    }

    /**
     *  wait()和 nofity()、notifyAll()，是Object对象的方法，notify先于wait执行会死锁
     */
    private void testWaitAndNotifyError() throws InterruptedException {
        Thread  consumerThread = new Thread(() ->{
            synchronized (this){
                while (baozhi == null){
                    System.out.println("没有包子，等待");
                    try {
                        Thread.sleep(3000);
                        this.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println("买完包子，回家");
            }
        });
        consumerThread.start();
        Thread.sleep(500);
        baozhi = new Object();
        System.out.println("生产包子");
        Thread.sleep(5000);
        synchronized (this){
            this.notify();
        }
    }


    /**
     * park() 和 unPark()，是LockSupport的方法
     */
    private void testParkAndUnPark() throws InterruptedException {
        Thread  consumerThread = new Thread(() ->{
            while (baozhi == null){
                System.out.println("没有包子，等待");
                LockSupport.park();
            }
            System.out.println("买完包子，回家");
        });
        consumerThread.start();
        Thread.sleep(500);
        baozhi = new Object();
        System.out.println("生产包子");
        LockSupport.unpark(consumerThread);
    }

    /**
     * park() 和 unPark()，是LockSupport的方法，在同步代码块里不会释放锁
     */
    private void testParkAndUnParkError() throws InterruptedException {
        Thread  consumerThread = new Thread(() ->{
            synchronized (this){
                while (baozhi == null){
                    System.out.println("没有包子，等待");
                    LockSupport.park();
                }
                System.out.println("买完包子，回家");
            }
        });
        consumerThread.start();
        Thread.sleep(500);
        baozhi = new Object();
        System.out.println("生产包子");
        synchronized (this){
            LockSupport.unpark(consumerThread);
        }
    }


    public static void main(String[] args) throws InterruptedException {
        ThreadCommunication threadCommunication = new ThreadCommunication();
//        threadCommunication.testSuspendAndResume();
//        threadCommunication.testSuspendAndResumeError1();
//        threadCommunication.testSuspendAndResumeError2();

//        threadCommunication.testWaitAndNotify();
        threadCommunication.testWaitAndNotifyError();

//        threadCommunication.testParkAndUnPark();
//        threadCommunication.testParkAndUnParkError();
    }
}
