package com.devil.observer.used;

/**
 * 通知者接口
 * Created by callmeDevil on 2019/7/27.
 */
public interface Subject {

    void attach(Observer observer);
    void detach(Observer observer);
    void call();

    String getAction();
    void setAction(String action);

}
