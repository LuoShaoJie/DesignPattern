package com.devil.singleton;

/**
 * Created by callmeDevil on 2019/8/17.
 */
public final class SingletonStatic { // 该类声明为final ，阻止派生，因为派生可能会增加实例

    // 第一次引用类的任何成员时就创建好实例，同时没有并发问题
    private static final SingletonStatic instance = new SingletonStatic();

    private SingletonStatic(){}

    public static SingletonStatic getInstance(){
        return instance;
    }

}
