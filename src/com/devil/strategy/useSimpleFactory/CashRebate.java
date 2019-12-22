package com.devil.strategy.useSimpleFactory;

/**
 * 打折收费子类
 * Created by callmeDevil on 2019/6/1.
 */
public class CashRebate extends CashSuper{

    // 折扣率
    private double moneyRebate = 1;

    public CashRebate(double moneyRebate) {
        // 打折收费，初始化时，必须输入折扣率，如打八折，就是0.8
        this.moneyRebate = moneyRebate;
    }

    @Override
    public double acceptCash(double money) {
        return money * moneyRebate;
    }

}
