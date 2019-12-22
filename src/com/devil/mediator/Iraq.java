package com.devil.mediator;

/**
 * 伊拉克（相当于 ConcreteColleague2 类）
 * Created by callmeDevil on 2019/12/15.
 */
public class Iraq extends Country{

    public Iraq(UnitedNations mediator) {
        super(mediator);
    }

    // 声明
    public void declare(String message){
        mediator.declare(message, this);
    }

    //获得消息
    public void getMessage(String message){
        System.out.println("伊拉克获得对方信息：" + message);
    }

}
