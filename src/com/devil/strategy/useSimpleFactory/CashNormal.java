package com.devil.strategy.useSimpleFactory;

/**
 * 正常收费子类
 * Created by callmeDevil on 2019/6/1.
 */
public class CashNormal extends CashSuper {
    @Override
    public double acceptCash(double money) {
        // 正常收费，原价返回
        return money;
    }
}
