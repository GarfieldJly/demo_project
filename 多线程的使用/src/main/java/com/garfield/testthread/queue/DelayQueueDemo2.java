package com.garfield.testthread.queue;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.*;

/**
 * @author jingliyuan
 * @date 2020/8/28
 * 有一个消费线程不断从delayQueue中取消息,取到了就在线程池中消费,如果消费失败重新加回队列,延迟时间变为之前的2倍
 */
public class DelayQueueDemo2 {
    public static DelayQueue<MessageBo> delayQueue = new DelayQueue<>();

    public static ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(5,10 ,
            5 ,TimeUnit.SECONDS,new LinkedBlockingDeque<>());
    //    生产的地方向队列里放一条消息
    public static void main(String[] args) {

        MessageBo messageBo = new MessageBo();
        messageBo.setSendTime(3);

        delayQueue.offer(messageBo);
        try {
            TimeUnit.SECONDS.sleep(2);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //消费者线程
        Thread consumerThread = new Thread(new Consumer());
        consumerThread.start();

    }

}


