package com.garfield.testthread.exercise;

import java.util.Random;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * @author jingliyuan
 * @date 2020/8/26
 * 对象:
 * 客户(排队编号,随机服务时长)
 * 服务窗口(编号,服务客户)
 * 调度中心(客户队列,窗口队列,生产者,消费者)
 *
 * 1.生产者每隔随机的一段时间创建一个客户,加入到客户队列,并唤醒消费线程
 * 2.消费者从客户队列,窗口队列取出客户,加入到任务中运行.如果没有就阻塞
 * 3.服务结束后将当前窗口加入到窗口队列
 */
public class ProducerDemo {
    public void producer()  {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(5,10,5, TimeUnit.SECONDS,new LinkedBlockingDeque<>());
        for (int i = 1; i <= 10; i++) {
            int finalI = i;
            threadPoolExecutor.execute(() ->{
                try {
                    TimeUnit.SECONDS.sleep(new Random().nextInt(5));
                    Customer customer = new Customer(finalI,finalI+"号加菲猫");
                    DispathcDemo.customerQueue.put(customer);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            });
        }
    }
}
