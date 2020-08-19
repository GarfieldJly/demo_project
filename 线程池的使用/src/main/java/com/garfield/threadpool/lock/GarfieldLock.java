package com.garfield.threadpool.lock;

import java.util.Iterator;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.LockSupport;

/**
 * @author jingliyuan
 * @date 2020/8/18
 * 自定义锁
 */
public class GarfieldLock implements Lock {
    //当前锁的拥有者
    private AtomicReference<Thread> owner = new AtomicReference<>();
    //等待获取锁的队列
    private LinkedBlockingQueue<Thread> waiter = new LinkedBlockingQueue();

    @Override
    public boolean tryLock() {
        return owner.compareAndSet(null,Thread.currentThread());
    }

    @Override
    public void lock() {
        boolean flag = true;
        while (!tryLock()){
            if(flag){
                waiter.offer(Thread.currentThread());
                flag = false;
            }
            //挂起
            LockSupport.park();
        }
        waiter.remove(Thread.currentThread());
    }

    @Override
    public void unlock() {
        boolean result = owner.compareAndSet(Thread.currentThread(), null);
        if(result){
            //waiter 清空
            Iterator<Thread> iterator = waiter.iterator();
            while (iterator.hasNext()){
                //线程唤醒
                LockSupport.unpark(iterator.next());

            }
        }

    }

    @Override
    public void lockInterruptibly() throws InterruptedException {

    }

    @Override
    public boolean tryLock(long time, TimeUnit unit) throws InterruptedException {
        return false;
    }

    @Override
    public Condition newCondition() {
        return null;
    }
}
