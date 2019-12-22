package com.devil.strategy.useSimpleFactory;

/**
 * 现金收费抽象类
 * Created by callmeDevil on 2019/6/1.
 */
public abstract class CashSuper {
    /**
     * 收取现金
     *
     * @param money 原价
     * @return 当前价
     */
    public abstract double acceptCash(double money);
}
