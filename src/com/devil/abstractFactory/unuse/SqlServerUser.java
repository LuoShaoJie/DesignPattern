package com.devil.abstractFactory.unuse;

/**
 * 假设sqlServer 连接，用于操作User表
 * Created by callmeDevil on 2019/7/28.
 */
public class SqlServerUser {

    public void insert(User user){
        System.out.println("在SQL Server中给User表增加一条记录");
    }

    public User getUser(int id){
        System.out.println("在SQL Server中根据ID得到User表一条记录");
        return null;
    }

}
