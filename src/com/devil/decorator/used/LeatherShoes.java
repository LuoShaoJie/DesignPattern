package com.devil.decorator.used;

/**
 * Created by callmeDevil on 2019/6/23.
 */
public class LeatherShoes extends Finery {

    @Override
    public void show() {
        System.out.print("皮鞋 ");
        super.show();
    }

}