package com.devil.singleton;

/**
 * Created by callmeDevil on 2019/8/17.
 */
public class SingletonOnLock {

    private static SingletonOnLock instance;

    private SingletonOnLock(){}

    public static SingletonOnLock getInstance(){
        // 同步代码块，只有一个线程能进入，其他阻塞
        synchronized (SingletonOnLock.class){
            if(instance == null){
                instance = new SingletonOnLock();
            }
        }
        return instance;
    }

}
