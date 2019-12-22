package com.devil.abstractFactory.used2_simpleFactory;

import com.devil.abstractFactory.used.*;

/**
 * 统一管理数据库访问
 * Created by callmeDevil on 2019/7/28.
 */
public class DataAccess {

    // 数据库名称，可替换成 Access
    private static final String DB = "SqlServer";
//    private static final String DB = "Access";

    public static IUser createUser() {
        IUser user = null;
        switch (DB) {
            case "SqlServer":
                user = new SqlServerUser();
                break;
            case "Access":
                user = new AccessUser();
                break;
            default:
                break;
        }
        return user;
    }

    public static IDepartment createDepartment() {
        IDepartment department = null;
        switch (DB) {
            case "SqlServer":
                department = new SqlServerDepartment();
                break;
            case "Access":
                department = new AccessDepartment();
                break;
            default:
                break;
        }
        return department;
    }

}
