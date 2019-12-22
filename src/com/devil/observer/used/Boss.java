package com.devil.observer.used;

import java.util.ArrayList;
import java.util.List;

/**
 * 老板
 * Created by callmeDevil on 2019/7/27.
 */
public class Boss implements Subject {

    // 同事列表
    private List<Observer> observers = new ArrayList<>();
    private String action;

    @Override
    public void attach(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void detach(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void call() {
        for (Observer observer : observers) {
            observer.update();
        }
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

}
