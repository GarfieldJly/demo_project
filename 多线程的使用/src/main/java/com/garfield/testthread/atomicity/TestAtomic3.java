package com.garfield.testthread.atomicity;

import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.LongAdder;

/**
 * @author jingliyuan
 * @date 2020/8/14
 * 测试 AtomicLong 和 LongAccumulator 的执行速度
 * 速度由小到大：Thread < AtomicLong < LongAddr
 */
public class TestAtomic3 {
    //写三个线程自增，每个线程运行2s，结束后看自增的值
    public static void main(String[] args) {
        TestAtomic3 testAtomic3 = new TestAtomic3();
        testAtomic3.testCount1();
        testAtomic3.testCount2();
        testAtomic3.testCount3();

    }

    /**
     * 用三个线程来看最后 count的值
     */
    Long count = 0L;
    private void testCount1(){

        long currentTimeMillis = System.currentTimeMillis();

        for (int i = 0; i < 3; i++) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    boolean flag = true;
                    while (flag){
                        if(System.currentTimeMillis() - currentTimeMillis < 2000){
                            count++;
                        }else{
                            flag = false;
                        }
                    }
                }
            }).start();
        }
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("testCount1 中 count的值:"+count);
    }

    private void testCount2(){
        AtomicLong atomicLong = new AtomicLong();
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(3,10 ,5,TimeUnit.SECONDS,new LinkedBlockingQueue<Runnable>() );
        for (int i = 0; i < 3; i++) {
            threadPoolExecutor.submit(() ->{
                long currentTimeMillis = System.currentTimeMillis();
                boolean flag = true;
                while (flag){
                    if(System.currentTimeMillis() - currentTimeMillis < 2000){
                        atomicLong.incrementAndGet();
//                        System.out.println("自增");
                    }else{
                        flag = false;
                    }
                }
            });
        }
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        threadPoolExecutor.shutdown();
        System.out.println("testCount2 中 atomicLong的值:"+atomicLong.longValue());
    }

    private void testCount3(){
        LongAdder longAdder = new LongAdder();
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(3,10 ,5,TimeUnit.SECONDS,new LinkedBlockingQueue<Runnable>() );
        for (int i = 0; i < 3; i++) {
            threadPoolExecutor.submit(() ->{
                long currentTimeMillis = System.currentTimeMillis();
                boolean flag = true;
                while (flag){
                    if(System.currentTimeMillis() - currentTimeMillis < 2000){
                        longAdder.increment();
                    }else{
                        flag = false;
                    }
                }
            });
        }
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        threadPoolExecutor.shutdown();
        System.out.println("testCount3 中 longAdder的值:"+longAdder.longValue());
    }
}
