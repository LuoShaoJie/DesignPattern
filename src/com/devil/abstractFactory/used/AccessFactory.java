package com.devil.abstractFactory.used;

/**
 * 实现IFactory 接口，实例化AccessUser
 * Created by callmeDevil on 2019/7/28.
 */
public class AccessFactory implements IFactory {
    @Override
    public IUser createUser() {
        return new AccessUser();
    }

    @Override
    public IDepartment createDepartment() {
        return new AccessDepartment(); //增加了AccessDepartment 工厂
    }

}
