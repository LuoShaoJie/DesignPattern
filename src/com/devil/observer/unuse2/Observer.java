package com.devil.observer.unuse2;

/**
 * 抽象观察者
 * Created by callmeDevil on 2019/7/27.
 */
public abstract class Observer {

    protected String name;
    protected Secretary sub;

    public Observer(String name, Secretary sub) {
        this.name = name;
        this.sub = sub;
    }

    public abstract void update();

}
