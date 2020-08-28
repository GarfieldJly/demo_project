package com.garfield.testthread.queue;

import java.util.concurrent.Delayed;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author jingliyuan
 * @date 2020/8/28
 */
public class MessageBo implements Delayed {
    //第几次执行
    private AtomicInteger count = new AtomicInteger(0);
    //最大执行次数
    public final static int MAX_COUNT = 5;
    //秒时间戳
    private long sendTime;

    @Override
    public long getDelay(TimeUnit unit) {
        return   unit.convert(this.sendTime - System.currentTimeMillis(), TimeUnit.MILLISECONDS);
    }

    @Override
    public int compareTo(Delayed o) {
        return o.getDelay(TimeUnit.MILLISECONDS) > this.getDelay(TimeUnit.MILLISECONDS) ? 1 :-1;
    }

    public MessageBo getNextMessageBo(long delayTime, TimeUnit timeUnit) {
        this.count.incrementAndGet();
        this.sendTime = System.currentTimeMillis() + TimeUnit.MILLISECONDS.convert(delayTime, timeUnit);
        System.out.println("sendTime:"+sendTime);
        return this;
    }

    public AtomicInteger getCount() {
        return count;
    }

    public void setCount(AtomicInteger count) {
        this.count = count;
    }

    public static int getMaxCount() {
        return MAX_COUNT;
    }

    public long getSendTime() {
        return sendTime;
    }

    public void setSendTime(long sendTime) {
        this.sendTime = sendTime;
    }

    @Override
    public String toString() {
        return "MessageBo{" +
                "count=" + count +
                ", sendTime=" + sendTime +
                '}';
    }
}
