package com.garfield.testthread.queue;


import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

/**
 * @author jingliyuan
 * @date 2020/8/28
 * 消费者从队列里取数据
 * 这个延迟队列有缺点,消息是放到内存里的重启就丢了,也不支持分布式,可以用RabbitMQ代替
 */
public class Consumer implements Runnable {
    @Override
    public void run() {
        try {
            boolean flag = true;
            while (flag) {
                MessageBo messageBo = DelayQueueDemo2.delayQueue.take();
                DelayQueueDemo2.threadPoolExecutor.submit(() ->{
                    if (messageBo.getCount().get() < MessageBo.MAX_COUNT) {
                        //下次执行的时间，有问题
//                        int nextMinute = (1 << messageBo.getCount().get()) - (1 << (messageBo.getCount().get() - 1));
                        long nextTime = TimeUnit.MILLISECONDS.convert((messageBo.getCount().get() + 1) * 2,TimeUnit.MILLISECONDS);
                        System.out.println("nextTime:" + nextTime);
                        MessageBo nextMessageBo = messageBo.getNextMessageBo(nextTime, TimeUnit.SECONDS);
                        DelayQueueDemo2.delayQueue.offer(nextMessageBo);
                        System.out.println("取出的消息:" + messageBo + ";;当前时间:" + new SimpleDateFormat("hh:mm:ss").format(new Date()));
                        try {
                            TimeUnit.SECONDS.sleep(1);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                });
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
