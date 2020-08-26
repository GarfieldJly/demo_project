package com.garfield.testthread.exercise;

/**
 * @author jingliyuan
 * @date 2020/8/26
 * 客户
 */
public class Customer {
    //编号
    private int customerCode;
    private String name;

    public int getCustomerCode() {
        return customerCode;
    }

    public void setCustomerCode(int customerCode) {
        this.customerCode = customerCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Customer() {
    }

    public Customer(int customerCode, String name) {
        this.customerCode = customerCode;
        this.name = name;
    }
}
