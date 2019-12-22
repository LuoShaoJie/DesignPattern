package com.devil.responsibility;

/**
 * 管理者
 * Created by callmeDevil on 2019/12/14.
 */
public abstract class Manager {

    protected String name;
    // 上级
    protected Manager superior;

    public Manager(String name){
        this.name = name;
    }

    // 设置上级
    public void setSuperior(Manager superior){
        this.superior = superior;
    }

    // 申请请求
    public abstract void requestApplications(Request request);

}
