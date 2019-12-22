package com.devil.adapter.unuse;

/**
 * 后卫
 * Created by callmeDevil on 2019/8/4.
 */
public class Guards extends Player {

    public Guards(String name){
        super(name);
    }

    @Override
    public void attack() {
        System.out.println(String.format("后卫 %s 进攻", name));
    }

    @Override
    public void defense() {
        System.out.println(String.format("后卫 %s 防守", name));
    }
}
