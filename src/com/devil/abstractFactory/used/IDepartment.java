package com.devil.abstractFactory.used;

/**
 * 用于客户端访问，解除与具体数据库访问的耦合
 * Created by callmeDevil on 2019/7/28.
 */
public interface IDepartment {
    void insert(Department department);
    Department getDepartment(int id);
}
