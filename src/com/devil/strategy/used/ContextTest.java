package com.devil.strategy.used;

/**
 * 策略模式测试
 * Created by callmeDevil on 2019/6/1.
 */
public class ContextTest {

    public static void main(String[] args) {
        double price = 400;
        double num = 3;
        System.out.println(String.format("单价：%s 元，数量：%s 个", price, num));

        String type = "正常收费";
        CashContext cashContext = new CashContext(type);
        double total = cashContext.getResult(price) * num;
        System.out.println(String.format("折扣：%s；总价：%s 元", type, total));

        type = "满300减100";
        cashContext = new CashContext(type);
        total = cashContext.getResult(price) * num;
        System.out.println(String.format("折扣：%s；总价：%s 元", type, total));

        type = "打8折";
        cashContext = new CashContext(type);
        total = cashContext.getResult(price) * num;
        System.out.println(String.format("折扣：%s；总价：%s 元", type, total));
    }

}
