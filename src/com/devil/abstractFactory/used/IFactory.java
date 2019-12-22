package com.devil.abstractFactory.used;

/**
 * 定义一个创建访问User 表对象的抽象工厂接口
 * Created by callmeDevil on 2019/7/28.
 */
public interface IFactory {
    IUser createUser();
    IDepartment createDepartment(); //增加的接口方法
}
