package com.devil.decorator.used;

/**
 * 究极进化 T恤（ConcreteDecorator）
 * Created by callmeDevil on 2019/6/23.
 */
public class TShirts extends Finery{

    @Override
    public void show() {
        System.out.print("大T恤 ");
        super.show();
    }

}
