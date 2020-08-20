package com.garfield.function.aqs;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;

/**
 * @author jingliyuan
 * @date 2020/8/20
 * 自定义写锁
 */
public class CustomWriteLock implements Lock {

    private GarfieldAqs garfieldAqs = new GarfieldAqs(){
        //写锁用到的
        //写锁 申请资源时候判断是否有读锁，如果没有就cas设置owner，如果有就阻塞
        //写锁 是否获取资源时候就cas设置owner
        @Override
        public boolean tryAcquire() {
            while (getState().get() == 0){
                return getOwner().compareAndSet(null,Thread.currentThread());
            }
            return false;
        }

        @Override
        public boolean tryRelease() {
            return getOwner().compareAndSet(Thread.currentThread(),null);
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
