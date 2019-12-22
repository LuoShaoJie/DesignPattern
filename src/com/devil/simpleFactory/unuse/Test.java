package com.devil.simpleFactory.unuse;

/**
 * 测试类
 * Created by callmeDevil on 2019/5/26.
 */
public class Test {

    public static void main(String[] args) {
        Operation operation = new Operation();
        double numA = 10;
        double numB = 2;
        System.out.println("加法：" + operation.getResult(numA, numB, "+"));
        System.out.println("减法：" + operation.getResult(numA, numB, "-"));
        System.out.println("乘法：" + operation.getResult(numA, numB, "*"));
        System.out.println("除法：" + operation.getResult(numA, numB, "/"));
    }

}
