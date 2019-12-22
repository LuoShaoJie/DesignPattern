package com.devil.abstractFactory.used;

import com.devil.abstractFactory.unuse.User;

/**
 * 用于访问Access 的User
 * Created by callmeDevil on 2019/7/28.
 */
public class AccessUser implements IUser {

    @Override
    public void insert(User user) {
        System.out.println("在Access 中给User表增加一条记录");
    }

    @Override
    public User getUser(int id) {
        System.out.println("在Access 中根据ID得到User表一条记录");
        return null;
    }

}
