package com.garfield.observer.bean;

public class ConcreteSubject extends Subject {

    public void doSomething(){
        System.out.println("具体的主体打印******");

        notifyObserver();
    }
}
