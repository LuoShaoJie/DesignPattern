package com.devil.singleton;

/**
 * Created by callmeDevil on 2019/8/17.
 */
public class SingletonStaticClass {

    private SingletonStaticClass() {}

    public SingletonStaticClass getInstande() {
        return InterClass.instance;
    }

    // 静态内部类，没有并发问题
    private static final class InterClass {
        public static SingletonStaticClass instance = new SingletonStaticClass();
    }

}
