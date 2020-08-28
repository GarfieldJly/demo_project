package com.garfield.testthread.queue;

import java.util.Date;
import java.util.concurrent.DelayQueue;
import java.util.concurrent.Delayed;
import java.util.concurrent.TimeUnit;

/**
 * @author jingliyuan
 * @date 2020/8/27
 *  （基于PriorityQueue来实现的）是一个存放Delayed 元素的无界阻塞队列，
 *  只有在延迟期满时才能从中提取元素。该队列的头部是延迟期满后保存时间最长的 Delayed 元素。
 *  如果延迟都还没有期满，则队列没有头部，并且poll将返回null。
 *  当一个元素的 getDelay(TimeUnit.NANOSECONDS) 方法返回一个小于或等于零的值时，
 *  则出现期满，poll就以移除这个元素了。此队列不允许使用 null 元素。
 */
public class DelayQueueDemo1 {
    static boolean flag =  true;
    public static void main(String[] args) {
        DelayQueue<User> delayQueue = new DelayQueue<>();
        delayQueue.offer(new User(new Date(System.currentTimeMillis() + 3000),"加菲猫"));


        new Thread(() ->{
           while (flag){
               User poll = delayQueue.poll();
               System.out.println("对象:"+poll);
               try {
                   TimeUnit.SECONDS.sleep(1);
               } catch (InterruptedException e) {
                   e.printStackTrace();
               }
               if (poll != null){
                   flag = false;
               }
           }
        }).start();

    }



}
// 实现Delayed接口的元素才能存到DelayQueue
class User implements Delayed {
    Date sendTime;
    String name;
    @Override
    public long getDelay(TimeUnit unit) {
        long time = sendTime.getTime() - System.currentTimeMillis();
        return TimeUnit.NANOSECONDS.convert(time,TimeUnit.NANOSECONDS);
    }

    @Override
    public int compareTo(Delayed o) {
        return o.getDelay(TimeUnit.NANOSECONDS) > this.getDelay(TimeUnit.NANOSECONDS) ? 1:-1;
    }

    public User(Date sendTime, String name) {
        this.sendTime = sendTime;
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "sendTime=" + sendTime +
                ", name='" + name + '\'' +
                '}';
    }
}
