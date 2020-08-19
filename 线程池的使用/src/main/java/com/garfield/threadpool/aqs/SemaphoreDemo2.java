package com.garfield.threadpool.aqs;

import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.Semaphore;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author jingliyuan
 * @date 2020/8/19
 * 信号量：可以指定多个线程同时访问一个资源，包括锁资源
 */
public class SemaphoreDemo2 {
/**
 * public Semaphore(int permits)；初始化信号量并指定能同时访问的线程数量
 * public Semaphore(int permits, boolean fair)；在实现上面的要求时额外指定是否使用公平锁
 *
 * 有5份资源，创建了10个线程去获取资源，获取到资源后休眠5s然后再释放资源，看看线程的执行情况
 */
    private final static int count = 5;
    private static GarfieldAqs garfieldAqs = new GarfieldAqs(){
    @Override
    public boolean tryAcquireShared() {
        if(this.getState().get() >0 ){
            return this.getState().decrementAndGet() >= 0 ? true : false;
        }
        return false;
    }

    @Override
    public boolean tryReleaseShared() {
        return this.getState().incrementAndGet() <= count ? true : false;
    }

};

    public static void main(String[] args) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(5, 10,5 ,TimeUnit.SECONDS ,new LinkedBlockingQueue<Runnable>());
        for (int i = 0; i < 10; i++) {
            threadPoolExecutor.submit(() ->{
                try {
                    System.out.println(Thread.currentThread().getName() + "尝试获取资源");
                    garfieldAqs.acquireShared();
                    System.out.println(Thread.currentThread().getName() + "获取资源");
                    Thread.sleep(2000);
                    garfieldAqs.releaseShared();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            });
        }
    }


}
