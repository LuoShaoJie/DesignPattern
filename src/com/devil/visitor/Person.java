package com.devil.visitor;

/**
 * 人
 * Created by callmeDevil on 2019/12/22.
 */
public abstract class Person {
    // 接受
    public abstract void accept(Action visitor);
}
