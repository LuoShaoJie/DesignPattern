package com.devil.abstractFactory.unuse_factory;

/**
 * 定义一个创建访问User 表对象的抽象工厂接口
 * Created by callmeDevil on 2019/7/28.
 */
public interface IFactory {
    IUser createUser();
}
