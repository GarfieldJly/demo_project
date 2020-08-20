package com.garfield.function.aqs;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;

/**
 * @author jingliyuan
 * @date 2020/8/20
 * 自定义读锁
 */
public class CustomReadLock implements Lock {

    private GarfieldAqs garfieldAqs = new GarfieldAqs(){
        //读锁用到的
        //读锁 加锁时如果有写锁且owner不是当前线程，加锁失败阻塞，否则state自增，加锁成功
        @Override
        public boolean tryAcquireShared() {
            if (getOwner() != null && !Thread.currentThread().equals(getOwner().get())){
                return false;
            }
            getState().incrementAndGet();
            return true;
        }
        //读锁 解锁时state减1
        @Override
        public boolean tryReleaseShared() {
            return getState().decrementAndGet() > 0;
        }
    };

    @Override
    public boolean tryLock() {
        return false;
    }

    @Override
    public void lock() {
        garfieldAqs.acquireShared();
    }

    @Override
    public void unlock() {
        garfieldAqs.releaseShared();
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
