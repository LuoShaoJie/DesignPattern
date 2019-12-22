package com.devil.visitor;

/**
 * 恋爱
 * Created by callmeDevil on 2019/12/22.
 */
public class Amativeness extends Action {

    @Override
    public void getManConclusion(Man concreteElementA) {
        System.out.println(String.format("%s %s时，背后多半是个高富帅。",
                concreteElementA.getClass().getSimpleName(), this.getClass().getSimpleName()));
    }

    @Override
    public void getWomanConclusion(Woman concreteElementB) {
        System.out.println(String.format("%s %s时，背后多半是个会打扮。",
                concreteElementB.getClass().getSimpleName(), this.getClass().getSimpleName()));
    }

}
