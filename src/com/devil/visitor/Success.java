package com.devil.visitor;

/**
 * 成功
 * Created by callmeDevil on 2019/12/22.
 */
public class Success extends Action {

    @Override
    public void getManConclusion(Man concreteElementA) {
        System.out.println(String.format("%s %s时，背后多半有一个伟大的女人。",
                concreteElementA.getClass().getSimpleName(), this.getClass().getSimpleName()));
    }

    @Override
    public void getWomanConclusion(Woman concreteElementB) {
        System.out.println(String.format("%s %s时，背后多半有一个不成功的男人。",
                concreteElementB.getClass().getSimpleName(), this.getClass().getSimpleName()));
    }

}
