package com.garfield.observer.bean;

public class TestObserver {

    public static void main(String[] args) {
        ConcreteObserver concreteObserver = new ConcreteObserver();

        ConcreteSubject concreteSubject = new ConcreteSubject();
        concreteSubject.add(concreteObserver);
        concreteSubject.doSomething();
    }
}
