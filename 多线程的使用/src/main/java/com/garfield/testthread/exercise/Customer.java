package com.garfield.testthread.exercise;

/**
 * @author jingliyuan
 * @date 2020/8/26
 * 客户(随机编号和享受服务时间)
 */
public class Customer {
    //编号
    private int customerCode;
    //随机执行时间
    private long randomExecutorTime;

    public int getCustomerCode() {
        return customerCode;
    }

    public void setCustomerCode(int customerCode) {
        this.customerCode = customerCode;
    }

    public long getRandomExecutorTime() {
        return randomExecutorTime;
    }

    public void setRandomExecutorTime(long randomExecutorTime) {
        this.randomExecutorTime = randomExecutorTime;
    }

    public Customer() {
    }

    public Customer(int customerCode, long randomExecutorTime) {
        this.customerCode = customerCode;
        this.randomExecutorTime = randomExecutorTime;
    }
}
