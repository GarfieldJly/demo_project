package com.garfield.testthread.exercise;

import java.util.Random;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.LockSupport;

/**
 * @author jingliyuan
 * @date 2020/8/26
 *
 * 1.生产者每隔随机的一段时间创建一个客户,加入到客户队列,并唤醒消费线程
 */
public class ProducerDemo implements Runnable{
    private Thread consumerThread;

    public ProducerDemo(Thread consumerThread) {
        this.consumerThread = consumerThread;
    }

    AtomicInteger atomicInteger = new AtomicInteger(0);
    @Override
    public void run() {
        while (true){
            try {

                int nextInt = new Random().nextInt(30);
                TimeUnit.SECONDS.sleep(nextInt);
                Customer customer = new Customer(atomicInteger.incrementAndGet(),new Random().nextInt(80));
                System.out.println("经过"+ nextInt + "秒来了一个客户");
                System.out.println(customer.getCustomerCode() + "号客户进入,服务时长:" + customer.getRandomExecutorTime() );
                DispatchDemo.customerQueue.offer(customer);
                System.out.println("客户加入队列");
                StringBuilder message = new StringBuilder("当前排队等待的客户:");
                DispatchDemo.customerQueue.forEach(waiter -> message.append(waiter.getCustomerCode()).append("  "));
                System.out.println(message);
                LockSupport.unpark(consumerThread);
                System.out.println("唤醒客户线程");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}
