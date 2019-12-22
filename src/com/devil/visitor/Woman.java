package com.devil.visitor;

/**
 * 女人
 * Created by callmeDevil on 2019/12/22.
 */
public class Woman extends Person{
    @Override
    public void accept(Action visitor) {
        visitor.getWomanConclusion(this);
    }
}
