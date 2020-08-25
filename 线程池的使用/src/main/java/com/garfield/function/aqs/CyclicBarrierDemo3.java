package com.garfield.function.aqs;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

/**
 * @author jingliyuan
 * @date 2020/8/24
 */
public class CyclicBarrierDemo3 {
    static CyclicBarrier cyclicBarrier = new CyclicBarrier(3,() ->{
        System.out.println("全部准备好");
    });

    static void ready(){
        try {
            System.out.println("小猪[" + Thread.currentThread().getName() + "] 在栅栏边等待其他小猪");
            cyclicBarrier.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (BrokenBarrierException e) {
            e.printStackTrace();
        }
        System.out.println("猪到齐了，小猪[" + Thread.currentThread().getName() + "] 与其他小猪一起冲破栅栏");
    }
    public static void main(String[] args) {

        new Thread(() ->ready()).start();
        new Thread(() ->ready()).start();
        new Thread(() ->ready()).start();

    }
}
