package com.devil.flyweight;

/**
 * 具体网站类
 * Created by callmeDevil on 2019/12/15.
 */
public class ConcreteWebSite extends WebSite{

    private String name = "";

    public ConcreteWebSite(String name){
        this.name = name;
    }

    @Override
    public void use(User user) {
        System.out.println("网站分类：" + name + " 用户：" + user.getName());
    }

}
