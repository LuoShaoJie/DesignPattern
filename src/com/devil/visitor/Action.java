package com.devil.visitor;

/**
 * 状态
 * Created by callmeDevil on 2019/12/22.
 */
public abstract class Action {
    // 得到男人结论或反应
    public abstract void getManConclusion(Man concreteElementA);
    // 得到女人结论或反应
    public abstract void getWomanConclusion(Woman concreteElementB);
}
