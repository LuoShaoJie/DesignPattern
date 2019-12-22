package com.devil.singleton;

/**
 * Created by callmeDevil on 2019/8/17.
 */
public class Singleton {

    private static Singleton instance;

    private Singleton(){} //构造方法私有，防止外界创建实例

    // 获得本类实例的唯一全局访问点
    public static Singleton getInstance(){
        if (instance == null) {
            //若实例不存在，则创建一个新实例，否则直接返回已有实例
            instance = new Singleton();
        }
        return instance;
    }

}
