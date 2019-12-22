package com.devil.abstractFactory.unuse_factory;

import com.devil.abstractFactory.unuse.User;

/**
 * 用于客户端访问，解除与具体数据库访问的耦合
 * Created by callmeDevil on 2019/7/28.
 */
public interface IUser {
    void insert(User user);
    User getUser(int id);
}
