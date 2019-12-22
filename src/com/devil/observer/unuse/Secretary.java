package com.devil.observer.unuse;

import java.util.ArrayList;
import java.util.List;

/**
 * 前台秘书MM
 * Created by callmeDevil on 2019/7/27.
 */
public class Secretary {

    // 同事列表
    private List<StockObserver> observers = new ArrayList<>();
    private String action;

    // 增加
    public void attach(StockObserver observer){
        // 有几个同事请前台帮忙，于是就给集合增加几个对象
        observers.add(observer);
    }

    // 通知
    public void call(){
        // 待老板来了，就给所有登记的同事们发通知
        for (StockObserver observer : observers) {
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
