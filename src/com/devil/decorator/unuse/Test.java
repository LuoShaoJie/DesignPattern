package com.devil.decorator.unuse;

/**
 * 装扮测试类
 * Created by callmeDevil on 2019/6/23.
 */
public class Test {

    public static void main(String[] args) {
        Person devil = new Person("Devil");

        System.out.println("第一种装扮：");
        devil.wearTShirts();
        devil.wearBigTrouser();
        devil.wearSneakers();
        devil.show();

        System.out.println("\n第二种装扮：");
        devil.wearSuit();
        devil.wearTie();
        devil.wearLeatherShoes();
        devil.show();
    }

}
