package com.garfield.function.aqs;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

/**
 * @author jingliyuan
 * @date 2020/8/20
 */
public class CyclicBarrierDemo1 {
    //等待几个线程都处理等待状态后再执行
    private static CyclicBarrier cyclicBarrier  = new CyclicBarrier(5,() ->{
        System.out.println("开始游戏.......");
    });

    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            new Thread(() -> {
                try {
                    Thread.sleep(500);
                    System.out.println("等待"+Thread.currentThread().getName()+"玩家选择英雄*****");
                    //await() 理解为已经准备好了，等待其它的玩家
                    cyclicBarrier.await();

                } catch (InterruptedException e) {
                    e.printStackTrace();
                } catch (BrokenBarrierException e) {
                    e.printStackTrace();
                }
            }).start();
        }


    }
}
