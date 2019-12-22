package com.devil.visitor;

/**
 * 失败
 * Created by callmeDevil on 2019/12/22.
 */
public class Failing extends Action {

    @Override
    public void getManConclusion(Man concreteElementA) {
        System.out.println(String.format("%s %s时，背后多半有一个不伟大的女人。",
                concreteElementA.getClass().getSimpleName(), this.getClass().getSimpleName()));
    }

    @Override
    public void getWomanConclusion(Woman concreteElementB) {
        System.out.println(String.format("%s %s时，背后多半有一个成功的男人。",
                concreteElementB.getClass().getSimpleName(), this.getClass().getSimpleName()));
    }

}
