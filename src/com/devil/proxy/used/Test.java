package com.devil.proxy.used;

/**
 * 代理模式测试
 * Created by callmeDevil on 2019/6/29.
 */
public class Test {

    public static void main(String[] args) {
        SchoolGirl jiaojiao = new SchoolGirl("李娇娇");
        Proxy proxy = new Proxy(jiaojiao);
        proxy.giveDolls();
        proxy.giveFlowers();
        proxy.giveChocolate();
    }

}
