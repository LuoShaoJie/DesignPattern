package com.devil.abstractFactory.unuse_factory;

import com.devil.abstractFactory.unuse.User;

/**
 * Created by callmeDevil on 2019/7/28.
 */
public class Test {
    public static void main(String[] args) {
        User user = new User();
        // 若要更改成 Access 数据库，只需要将此处改成
        // IFactory factory = new AccessFactory();
        IFactory sqlServerFactory = new SqlServerFactory();
        IUser iUser = sqlServerFactory.createUser();
        iUser.insert(user);
        iUser.getUser(1);
    }
}
