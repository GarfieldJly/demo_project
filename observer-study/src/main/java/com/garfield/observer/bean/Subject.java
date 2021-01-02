package com.garfield.observer.bean;

import java.util.Vector;

public class Subject {
    private Vector<Observer> observerVector = new Vector<>();

    public void add(Observer observer){
        observerVector.add(observer);
    }

    public void delete(Observer observer){
        observerVector.remove(observer);
    }

    /**
     * 通知所有的观察者进行更新
     */
    public void notifyObserver(){
        for (Observer observer : observerVector){
            observer.update();
        }
    }
}
