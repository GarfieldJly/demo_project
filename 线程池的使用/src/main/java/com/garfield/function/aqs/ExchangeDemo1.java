package com.garfield.function.aqs;

import java.util.concurrent.*;

/**
 * @author jingliyuan
 * @date 2020/9/1
 * 线程间交换数据的工具--Exchanger
 * Exchanger是一个用于线程间协作的工具类，用于两个线程间能够交换。它提供了一个交换的同步点，在这个同步点两个线程能够交换数据。
 * 具体交换数据是通过exchange方法来实现的，如果一个线程先执行exchange方法，那么它会同步等待另一个线程也执行exchange方法，
 * 这个时候两个线程就都达到了同步点，两个线程就可以交换数据。
 *
 * Exchanger除了一个无参的构造方法外，主要方法也很简单：​​ //当一个线程执行该方法的时候，会等待另一个线程也执行该方法，
 * 因此两个线程就都达到了同步点​ //将数据交换给另一个线程，同时返回获取的数据​ V exchange(V x) throws InterruptedException​
 */
public class ExchangeDemo1 {
    Exchanger exchanger = new Exchanger();

    public void dialog(){
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(2,10,5, TimeUnit.SECONDS,new LinkedBlockingDeque<>());

        threadPoolExecutor.execute(() ->{
            String yuanyuan = "11：30了，要不要去吃饭?";
            try {
                Object exchange = exchanger.exchange(yuanyuan);
                System.out.println(exchange);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        threadPoolExecutor.execute(() ->{
           String juanjuan = "吃吃吃，长个嘴只知道吃";
            try {
                TimeUnit.SECONDS.sleep(3);
                Object exchange = exchanger.exchange(juanjuan);
                System.out.println(exchange);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        try {
            TimeUnit.SECONDS.sleep(5);
            threadPoolExecutor.shutdownNow();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("这俩人吵起来了.....");
    }

    public static void main(String[] args) {
        ExchangeDemo1 exchangeDemo1 = new ExchangeDemo1();
        exchangeDemo1.dialog();
    }
}
