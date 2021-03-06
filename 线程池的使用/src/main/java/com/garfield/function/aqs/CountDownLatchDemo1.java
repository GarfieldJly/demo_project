package com.garfield.function.aqs;

import org.springframework.util.StopWatch;

import java.util.concurrent.CountDownLatch;

/**
 * @author jingliyuan
 * @date 2020/8/19
 */
public class CountDownLatchDemo1 {
    private static CountDownLatch countDownLatch = new CountDownLatch(10);

    public static void main(String[] args) {
        new Thread(() ->{
            StopWatch stopWatch = new StopWatch();
            stopWatch.start();
            try {
                //await是申请资源，但计数器不为0认为没有申请成功，要阻塞
                countDownLatch.await();
                stopWatch.stop();
                System.out.println("经过"+stopWatch.getTotalTimeMillis()+"ms后执行完成");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();

        for (int i = 0; i < 10; i++) {
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            countDownLatch.countDown();
        }
    }

}
