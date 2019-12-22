package com.devil.abstractFactory.unuse_factory;

/**
 * 实现IFactory 接口，实例化AccessUser
 * Created by callmeDevil on 2019/7/28.
 */
public class AccessFactory implements IFactory {
    @Override
    public IUser createUser() {
        return new AccessUser();
    }
}
