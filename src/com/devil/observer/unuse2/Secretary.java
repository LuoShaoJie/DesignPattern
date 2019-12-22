package com.devil.observer.unuse2;

import java.util.ArrayList;
import java.util.List;

/**
 * 前台秘书MM
 * Created by callmeDevil on 2019/7/27.
 */
public class Secretary {

    // 同事列表
    private List<Observer> observers = new ArrayList<>();
    private String action;

    // 增加
    public void attach(Observer observer) { //针对抽象编程，减少了与具体类的耦合
        observers.add(observer);
    }

    // 减少
    public void detach(Observer observer) { //针对抽象编程，减少了与具体类的耦合
        observers.remove(observer);
    }

    // 通知
    public void call() {
        // 待老板来了，就给所有登记的同事们发通知
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
