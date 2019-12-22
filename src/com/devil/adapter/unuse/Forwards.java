package com.devil.adapter.unuse;

/**
 * 前锋
 * Created by callmeDevil on 2019/8/4.
 */
public class Forwards extends Player {

    public Forwards(String name){
        super(name);
    }

    @Override
    public void attack() {
        System.out.println(String.format("前锋 %s 进攻", name));
    }

    @Override
    public void defense() {
        System.out.println(String.format("前锋 %s 防守", name));
    }
}
