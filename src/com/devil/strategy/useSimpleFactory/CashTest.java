package com.devil.strategy.useSimpleFactory;

/**
 * 现金收费测试
 * Created by callmeDevil on 2019/6/1.
 */
public class CashTest {

    public static void main(String[] args) {
        double price = 400;
        double num = 3;
        System.out.println(String.format("单价：%s 元，数量：%s 个", price, num));

        String type = "正常收费";
        CashSuper cashSuper = CashFactory.createCashAccept(type);
        double total = cashSuper.acceptCash(price) * num;
        System.out.println(String.format("折扣：%s；总价：%s 元", type, total));

        type = "满300减100";
        cashSuper = CashFactory.createCashAccept(type);
        total = cashSuper.acceptCash(price) * num;
        System.out.println(String.format("折扣：%s；总价：%s 元", type, total));

        type = "打8折";
        cashSuper = CashFactory.createCashAccept(type);
        total = cashSuper.acceptCash(price) * num;
        System.out.println(String.format("折扣：%s；总价：%s 元", type, total));
    }

}
