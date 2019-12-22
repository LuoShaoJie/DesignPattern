package com.devil.decorator.used;

/**
 * 装饰模式测试
 * Created by callmeDevil on 2019/6/23.
 */
public class Test {

    public static void main(String[] args) {
        Person devil = new Person("Devil");

        System.out.println("第一种装扮：");
        Sneakers sneakers = new Sneakers();
        BigTrouser bigTrouser = new BigTrouser();
        TShirts tShirts = new TShirts();
        // 装饰
        sneakers.decorate(devil);
        bigTrouser.decorate(sneakers);
        tShirts.decorate(bigTrouser);
        tShirts.show();

        System.out.println("\n第二种装扮：");
        LeatherShoes leatherShoes = new LeatherShoes();
        Tie tie = new Tie();
        Suit suit = new Suit();
        // 装饰
        leatherShoes.decorate(devil);
        tie.decorate(leatherShoes);
        suit.decorate(tie);
        suit.show();
    }

}
