package com.garfield.threadpool.aqs;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;

/**
 * @author jingliyuan
 * @date 2020/8/19
 * 自定义锁，使用AQS的方法
 */
public class CustomLock implements Lock {
    private AtomicReference<Thread> owner = new AtomicReference<>();
    private GarfieldAqs garfieldAqs = new GarfieldAqs(){
        @Override
        public boolean tryAcquire() {
            return owner.compareAndSet(null,Thread.currentThread());
        }

        @Override
        public boolean tryRelease() {
            return owner.compareAndSet(Thread.currentThread(),null);
        }
    };

    @Override
    public boolean tryLock() {
        return false;
    }

    @Override
    public void lock() {
        garfieldAqs.acquire();
    }

    @Override
    public void unlock() {
        garfieldAqs.release();
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
