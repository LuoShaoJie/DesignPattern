package com.devil.observer.used;

/**
 * 抽象观察者
 * Created by callmeDevil on 2019/7/27.
 */
public abstract class Observer {

    protected String name;
    protected Subject sub;

    public Observer(String name, Subject sub) { // 原来是“前台MM”，现改成“抽象通知者”
        this.name = name;
        this.sub = sub;
    }

    public abstract void update();

}
