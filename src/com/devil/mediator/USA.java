package com.devil.mediator;

/**
 * 美国（相当于 ConcreteColleague1 类）
 * Created by callmeDevil on 2019/12/15.
 */
public class USA extends Country{

    public USA(UnitedNations mediator) {
        super(mediator);
    }

    // 声明
    public void declare(String message){
        mediator.declare(message, this);
    }

    //获得消息
    public void getMessage(String message){
        System.out.println("美国获得对方信息：" + message);
    }

}
