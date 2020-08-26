package com.garfield.testthread.Queue;

import java.util.concurrent.*;

/**
 * @author jingliyuan
 * @date 2020/8/26
 */
public class TestBasket {
    Basket basket = new Basket();
    class Producer implements Runnable {
        @Override
        public void run() {
            while (true){
                // 生产苹果
                System.out.println("生产者准备生产苹果："
                        + System.currentTimeMillis());
                try {
                    basket.producer();

                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("生产者生产苹果完毕："
                        + System.currentTimeMillis());
                System.out.println("生产完后有苹果："+basket.getAppleNumber()+"个");
                try {
                    TimeUnit.MILLISECONDS.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    class Consumer implements Runnable{
        @Override
        public void run() {

            while (true){
                // 消费苹果
                System.out.println("消费者准备消费苹果："
                        + System.currentTimeMillis());
                try {
                    basket.customer();
                    TimeUnit.SECONDS.sleep(2);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("消费者消费苹果完毕："
                        + System.currentTimeMillis());
                System.out.println("消费完后有苹果："+basket.getAppleNumber()+"个");
                // 休眠1000ms
                try {
                    TimeUnit.SECONDS.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }


        }
    }

    public void test() throws InterruptedException {
        Producer producer = new Producer();
        Consumer consumer = new Consumer();

        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(5,10,5,TimeUnit.SECONDS,new LinkedBlockingDeque<>());
        threadPoolExecutor.execute(producer);
        threadPoolExecutor.execute(consumer);

        TimeUnit.SECONDS.sleep(10);
        threadPoolExecutor.shutdown();

    }

    public static void main(String[] args) throws InterruptedException {
        TestBasket testBasket = new TestBasket();
        testBasket.test();

    }
}
