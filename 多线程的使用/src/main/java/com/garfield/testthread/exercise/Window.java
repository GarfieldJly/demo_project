package com.garfield.testthread.exercise;

/**
 * @author jingliyuan
 * @date 2020/8/26
 * 服务窗口(编号,服务客户)
 *
 */
public class Window {
    private int windowCode;
    private Customer customer;

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
}
