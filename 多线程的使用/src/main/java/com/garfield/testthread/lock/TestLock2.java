package com.garfield.testthread.lock;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.locks.LockSupport;

/**
 * @author jingliyuan
 * @date 2020/10/13
 *  两个线程，一个线程打印1-52，另一个线程打印A-Z，打印顺序是 12A34B...5152Z
 *  12A34B56C78D910E1112F1314G1516H1718I1920J2122K2324L2526M2728N2930O3132P3334Q3536R3738S3940T4142U4344V4546W4748X4950Y5152Z
 */
public class TestLock2 {
    static Thread thread1,thread2;
    public static void main(String[] args) {
        //使用CountDownLatch ，当两个线程的值打印结束后，在主线程输出
        CountDownLatch countDownLatch = new CountDownLatch(1);
        StringBuffer stringBuffer = new StringBuffer();

        thread1 = new Thread(() ->{
            for (int i = 1; i <= 52 ; i++) {
                stringBuffer.append(i);
                if(i % 2 == 0){
                    LockSupport.park();
                    LockSupport.unpark(thread2);
                }
            }

        });

        thread2 = new Thread(() ->{
            for (int i = 65;i <= 90 ; i++) {
                stringBuffer.append((char)i);
                LockSupport.unpark(thread1);
                LockSupport.park();
            }
            countDownLatch.countDown();
        });

        thread1.start();
        thread2.start();
//        try {
//            TimeUnit.SECONDS.sleep(5);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
        try {
            countDownLatch.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(stringBuffer.toString());

    }
}
