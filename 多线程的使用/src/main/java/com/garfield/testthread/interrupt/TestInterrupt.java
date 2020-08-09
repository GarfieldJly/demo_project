package com.garfield.testthread.interrupt;

public class TestInterrupt {
    public static void main(String[] args) {
       StopRunnable stopRunnable = new StopRunnable();
        Thread stopThread = new Thread(stopRunnable);
        stopThread.start();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //i 和 j 的值可能不一样，线程不安全，不推荐此用法
//        stopThread.stop();
        //i 和 j 的值一样，会抛InterruptedException异常，执行异常之后的代码，推荐此用法
        stopThread.interrupt();
        while (stopThread.isAlive()){
            //死循环，等待stopThread状态为 Terminated
        }
        stopRunnable.compareValue();

    }
}
