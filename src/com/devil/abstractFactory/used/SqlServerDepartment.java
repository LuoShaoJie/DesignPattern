package com.devil.abstractFactory.used;

/**
 * 用于访问SqlServer 的Department
 * Created by callmeDevil on 2019/7/28.
 */
public class SqlServerDepartment implements IDepartment {

    @Override
    public void insert(Department department) {
        System.out.println("在SQL Server中给Department 表增加一条记录");
    }

    @Override
    public Department getDepartment(int id) {
        System.out.println("在SQL Server中根据ID得到Department表一条记录");
        return null;
    }

}
