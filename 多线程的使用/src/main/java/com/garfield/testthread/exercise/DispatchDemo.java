package com.garfield.testthread.exercise;

import java.util.concurrent.LinkedBlockingQueue;

/**
 * @author jingliyuan
 * @date 2020/8/26
 * 对象:
 *  * 客户(排队编号,随机服务时长)
 *  * 服务窗口(编号,服务客户)
 *  * 调度中心(客户队列,窗口队列,生产者,消费者)
 *  *
 *  * 1.生产者每隔随机的一段时间创建一个客户,加入到客户队列,并唤醒消费线程
 *  * 2.消费者从客户队列,窗口队列取出客户,加入到任务中运行.如果没有就阻塞
 *  * 3.服务结束后将当前窗口加入到窗口队列
 */
public class DispatchDemo {
    //客户队列
    public static LinkedBlockingQueue<Customer> customerQueue = new LinkedBlockingQueue();
    //窗口队列
    public static LinkedBlockingQueue<Window> windowQueue = new LinkedBlockingQueue();
    public static Thread customerThead;

    static {
        //初始化窗口队列
        for (int i = 1; i <= 5; i++) {
            Window window = new Window(i);
            try {
                window.setWindowCode(i);
                windowQueue.put(window);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void dispatch()  {

        customerThead = new Thread(new ConsumerDemo());
        customerThead.start();
        Thread producerThread = new Thread(new ProducerDemo(customerThead));
        producerThread.start();


    }

    public static void main(String[] args) {
        DispatchDemo dispathcDemo = new DispatchDemo();
        dispathcDemo.dispatch();
    }
}
