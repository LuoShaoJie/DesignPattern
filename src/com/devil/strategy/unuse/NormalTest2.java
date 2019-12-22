package com.devil.strategy.unuse;

/**
 * 普通实现2
 * Created by callmeDevil on 2019/6/1.
 */
public class NormalTest2 {

    public static void main(String[] args) {
        double price = 10;
        double num = 5;
        String[] discounts = {"正常收费", "打八折", "打七折", "打五折"};
        System.out.println(String.format("单价：%s 元", price));
        System.out.println(String.format("数量：%s 个", num));
        System.out.println(String.format("折扣：%s ", discounts[1]));
        System.out.println(String.format("总价：%s 元", calculateTotal(price, num, 1)));
    }

    /**
     * 计算总价
     *
     * @param price    单价
     * @param num      数量
     * @param discount 折扣
     * @return
     */
    private static double calculateTotal(double price, double num, int discount) {
        double total = 0L;
        switch (discount) {
            case 0:
                total = price * num;
                break;
            case 1:
                total = price * num * 0.8;
                break;
            case 2:
                total = price * num * 0.7;
                break;
            case 3:
                total = price * num * 0.5;
                break;
            default:
                break;
        }
        return total;
    }

}
