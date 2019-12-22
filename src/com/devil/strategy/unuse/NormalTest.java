package com.devil.strategy.unuse;

/**
 * 普通实现
 * Created by callmeDevil on 2019/6/1.
 */
public class NormalTest {

    public static void main(String[] args) {
        double price = 10;
        double num = 5;
        System.out.println(String.format("单价：%s 元", price));
        System.out.println(String.format("数量：%s 个", num));
        System.out.println(String.format("总价：%s 元", calculateTotal(price, num)));
    }

    /**
     * 计算总价
     *
     * @param price 单价
     * @param num   数量
     * @return
     */
    private static double calculateTotal(double price, double num) {
        return price * num;
    }

}
