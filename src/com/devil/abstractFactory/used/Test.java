package com.devil.abstractFactory.used;

import com.devil.abstractFactory.unuse.User;

/**
 * Created by callmeDevil on 2019/7/28.
 */
public class Test {
    public static void main(String[] args) {
        User user = new User();
        Department dept = new Department();
        // 只需确定实例化哪一个数据库访问对象给 factory
        IFactory factory = new AccessFactory();
        // 则此时已于具体的数据库访问解除了依赖
        IUser iUser = factory.createUser();
        iUser.insert(user);
        iUser.getUser(1);

        IDepartment iDept = factory.createDepartment();
        iDept.insert(dept);
        iDept.getDepartment(1);
    }
}
