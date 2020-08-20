package com.garfield.function.aqs;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.locks.LockSupport;

/**
 * @author jingliyuan
 * @date 2020/8/20
 * 这个的场景就是把一个很大计算量的任务拆成多个小的任务并行计算，全部计算完成后再汇总
 */
public class CyclicBarrierDemo2 {
    /**
     * 写三个线程，第一个线程从1加到1000，第二个线程从1001加到2000，
     * 第三个线程从2001加到3000，三个线程都计算完成后，获取他们的计算结果然后相加
     */
    private Integer sum = 0;
    private Integer sum1 = 0;
    private Integer sum2 = 0;
    private Integer sum3 = 0;
    private CyclicBarrier cyclicBarrier = new CyclicBarrier(3, () -> {
        sum = sum1 + sum2 + sum3;
        System.out.println("sum 的值是:" + sum);
    });

    private Thread thread1,thread2,thread3;
    private void sum() {
        thread1 = new Thread(() -> {

            for (int i = 1; i <= 1000; i++) {
                sum1 += i;
            }
//            LockSupport.unpark(thread2);
            try {
                cyclicBarrier.await();
            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (BrokenBarrierException e) {
                e.printStackTrace();
            }
        });

        thread2 = new Thread(() -> {
//            LockSupport.park();
            for (int i = 1001; i <= 2000; i++) {
                sum2 += i;
            }
//            LockSupport.unpark(thread3);
            try {
                cyclicBarrier.await();
            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (BrokenBarrierException e) {
                e.printStackTrace();
            }
        });

        thread3 = new Thread(() -> {
//            LockSupport.park();
            for (int i = 2001; i <= 3000; i++) {
                sum3 += i;
            }
            try {
                cyclicBarrier.await();
            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (BrokenBarrierException e) {
                e.printStackTrace();
            }
        });

        thread1.start();
        thread2.start();
        thread3.start();

    }

    public static void main(String[] args) {
        CyclicBarrierDemo2 cyclicBarrierDemo2 = new CyclicBarrierDemo2();
        cyclicBarrierDemo2.sum();
    }
}
