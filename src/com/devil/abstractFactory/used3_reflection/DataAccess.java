package com.devil.abstractFactory.used3_reflection;

import com.devil.abstractFactory.used.*;

/**
 * 统一管理数据库访问
 * Created by callmeDevil on 2019/7/28.
 */
public class DataAccess {

    // 数据库名称，从配置文件中获取
    private static String DB;

    public static IUser createUser() throws Exception {
        if (DB == null || DB.trim() == "") {
            return null;
        }
        // 拼接具体数据库访问类的权限定名
        String className = "com.devil.abstractFactory.unuse." + DB + "User";
        return (IUser) Class.forName(className).newInstance();
    }

    public static IDepartment createDeptment() throws Exception {
        if (DB == null || DB.trim() == "") {
            return null;
        }
        // 拼接具体数据库访问类的权限定名
        String className = "com.devil.abstractFactory.unuse." + DB + "Department";
        return (IDepartment) Class.forName(className).newInstance();
    }

    public static String getDB() {
        return DB;
    }

    public static void setDB(String DB) {
        DataAccess.DB = DB;
    }

}
