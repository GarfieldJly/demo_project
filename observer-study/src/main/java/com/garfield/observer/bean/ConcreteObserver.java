package com.garfield.observer.bean;

/**
 * 具体的观察者
 */
public class ConcreteObserver implements Observer{
    @Override
    public void update() {
        System.out.println("观察者收到通知");
    }
}
