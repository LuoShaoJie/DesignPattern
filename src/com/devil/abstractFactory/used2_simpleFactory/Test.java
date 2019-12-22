package com.devil.abstractFactory.used2_simpleFactory;

import com.devil.abstractFactory.unuse.User;
import com.devil.abstractFactory.used.Department;
import com.devil.abstractFactory.used.IDepartment;
import com.devil.abstractFactory.used.IUser;

/**
 * Created by callmeDevil on 2019/7/28.
 */
public class Test {
    public static void main(String[] args) {
        User user = new User();
        Department dept = new Department();
        // 直接得到实际的数据库访问实例，而不存在任何的依赖
        IUser iUser = DataAccess.createUser();
        iUser.insert(user);
        iUser.getUser(1);

        IDepartment iDept = DataAccess.createDepartment();
        iDept.insert(dept);
        iDept.getDepartment(1);
    }
}
