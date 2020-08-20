package com.garfield.function.aqs;

import org.springframework.util.StopWatch;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author jingliyuan
 * @date 2020/8/19
 * 自定义CountDownLatch
 */
public class CountDownLatchDemo2 {
    private final static int count = 10;
    private static GarfieldAqs garfieldAqs = new GarfieldAqs(){
        @Override
        public boolean tryAcquireShared() {
            //await是申请资源，但计数器不为0认为没有申请成功，要阻塞
            return getState().get() == 0;
        }

        @Override
        public boolean tryReleaseShared() {
            //调用countdown的时候是释放资源，但只有计数器减到0才认为是释放成功了
            return getState().decrementAndGet() == 0;
        }
    };

    public static void main(String[] args) {
        //初始化 CountDownLatch 的值
        garfieldAqs.setState(new AtomicInteger(count));

        new Thread(() ->{
            StopWatch stopWatch = new StopWatch();
            stopWatch.start();
            //当减为0时，开始执行
            garfieldAqs.acquireShared();
            stopWatch.stop();
            System.out.println("经过"+stopWatch.getTotalTimeMillis()+"ms后执行完成");
        }).start();

        for (int i = 0; i < 10; i++) {
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            garfieldAqs.releaseShared();
        }
    }

}
