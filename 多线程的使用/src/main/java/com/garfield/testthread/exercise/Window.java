package com.garfield.testthread.exercise;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.LockSupport;

/**
 * @author jingliyuan
 * @date 2020/8/26
 * 服务窗口(窗口编号,服务客户，客户等待线程)
 *
 */
public class Window implements Runnable{
    private int windowCode;

    private Customer customer;

    private Thread customerThread;

    public Window(int windowCode) {
        this.windowCode = windowCode;
    }

    public int getWindowCode() {
        return windowCode;
    }

    public void setWindowCode(int windowCode) {
        this.windowCode = windowCode;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    @Override
    public void run() {

        System.out.println("-----START-----" + windowCode + "号窗口开始为" + customer.getCustomerCode() + "号客户办理业务");
        //具体执行逻辑
        long randomExecutorTime = customer.getRandomExecutorTime();
        try {
            TimeUnit.SECONDS.sleep(randomExecutorTime);
            System.out.println("-----END-----" + windowCode + "号窗口为" + customer.getCustomerCode() + "号客户办理完成业务");
            //服务完后把该窗口添加到窗口队列
            DispatchDemo.windowQueue.offer(this);
            //唤醒客户消费线程来执行
            LockSupport.unpark(customerThread);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public Thread getCustomerThread() {
        return customerThread;
    }

    public void setCustomerThread(Thread customerThread) {
        this.customerThread = customerThread;
    }
}
