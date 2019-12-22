package com.devil.abstractFactory.used3_reflection;

import com.devil.abstractFactory.unuse.User;
import com.devil.abstractFactory.used.Department;
import com.devil.abstractFactory.used.IDepartment;
import com.devil.abstractFactory.used.IUser;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;

/**
 * Created by callmeDevil on 2019/7/28.
 */
public class Test {
    public static void main(String[] args) throws Exception {
        // 加载配置文件
        Properties properties = new Properties();
        InputStream is = new FileInputStream(new File("D:\\IDEA_Projects\\DesignPattern\\src\\com\\devil\\abstractFactory\\used3_reflection\\db.properties"));
        properties.load(is);
        is.close();
        String db = properties.getProperty("db");
        // 使用具体的数据库告诉管理类
        DataAccess dataAccess = new DataAccess();
        dataAccess.setDB(db);

        User user = new User();
        IUser iUser = dataAccess.createUser();
        iUser.insert(user);
        iUser.getUser(1);

        Department dept = new Department();
        IDepartment iDept = dataAccess.createDeptment();
        iDept.insert(dept);
        iDept.getDepartment(1);
    }
}
