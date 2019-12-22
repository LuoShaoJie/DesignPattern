package com.devil.decorator.unuse2;

/**
 * 装饰升级版测试
 * Created by callmeDevil on 2019/6/23.
 */
public class Test {

    public static void main(String[] args) {
        Person devil = new Person("Devil");

        System.out.println("第一种装扮：");
        Finery tShirts = new TShirts();
        Finery bigTrouser = new BigTrouser();
        Finery sneakers = new Sneakers();
        tShirts.show();
        bigTrouser.show();
        sneakers.show();
        devil.show();

        System.out.println("\n第二种装扮：");
        Finery suit = new Suit();
        Finery tie = new Tie();
        Finery leatherShoes = new LeatherShoes();
        suit.show();
        tie.show();
        leatherShoes.show();
        devil.show();
    }

}
