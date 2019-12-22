package com.devil.proxy.used;

/**
 * 代替追求者的人
 * Created by callmeDevil on 2019/6/29.
 */
public class Proxy implements GiveGift {

    Pursuit gg;

    public Proxy(SchoolGirl mm) {
        // 礼物实际上是追求者买来送的，这个人只是负责传递礼物
        this.gg = new Pursuit(mm);
    }

    @Override
    public void giveDolls() {
        gg.giveDolls();
    }

    @Override
    public void giveFlowers() {
        gg.giveFlowers();
    }

    @Override
    public void giveChocolate() {
        gg.giveChocolate();
    }

}
