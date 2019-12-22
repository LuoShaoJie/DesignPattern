package com.devil.adapter.unuse;

/**
 * 中锋
 * Created by callmeDevil on 2019/8/4.
 */
public class Center extends Player {

    public Center(String name){
        super(name);
    }

    @Override
    public void attack() {
        System.out.println(String.format("中锋 %s 进攻", name));
    }

    @Override
    public void defense() {
        System.out.println(String.format("中锋 %s 防守", name));
    }
}
