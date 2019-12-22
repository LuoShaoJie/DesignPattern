package com.devil.adapter.unuse;

/**
 * 球员
 * Created by callmeDevil on 2019/8/4.
 */
public abstract class Player {

    protected String name;

    public Player(String name){
        this.name = name;
    }

    // 发起进攻
    public abstract void attack();
    // 转回防守
    public abstract void defense();

}
