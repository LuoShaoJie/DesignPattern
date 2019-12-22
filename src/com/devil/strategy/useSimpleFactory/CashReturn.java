package com.devil.strategy.useSimpleFactory;

/**
 * 返利收费子类
 * Created by callmeDevil on 2019/6/1.
 */
public class CashReturn extends CashSuper{

    // 返利条件
    private double moneyCondition = 0;
    // 返利值
    private double moneyReturn = 0;

    // 返利收费，初始化时必须输入返利条件和返利值，比如满300返100，
    // 则moneyCondition 为300，moneyReturn 为100
    public CashReturn(double moneyCondition, double moneyReturn) {
        this.moneyCondition = moneyCondition;
        this.moneyReturn = moneyReturn;
    }

    @Override
    public double acceptCash(double money) {
        double result = money;
        if (money >= moneyCondition) {
            // 若大于返利条件，则需要减去返利值
            result = money - Math.floor(money / moneyCondition) * moneyReturn;
        }
        return result;
    }

}
