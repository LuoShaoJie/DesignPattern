package com.devil.singleton;

/**
 * Created by callmeDevil on 2019/8/17.
 */
public class SingletonOnDoubleCheckLock {

    private static SingletonOnDoubleCheckLock instance;

    private SingletonOnDoubleCheckLock(){}

    public static SingletonOnDoubleCheckLock getInstance(){
        // 先判断实例是否存在，不存在再考虑并发问题
        if (instance == null) {
            synchronized (SingletonOnDoubleCheckLock.class){
                if(instance == null){
                    instance = new SingletonOnDoubleCheckLock();
                }
            }
        }
        return instance;
    }

}
