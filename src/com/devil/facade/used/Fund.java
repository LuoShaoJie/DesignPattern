package com.devil.facade.used;

import com.devil.facade.unuse.*;

/**
 * 基金类（Facade）
 * Created by callmeDevil on 2019/7/20.
 */
public class Fund {

    private Stock1 stock1;
    private Stock2 stock2;
    private Stock3 stock3;
    private NationalDebt1 debt1;
    private Realty1 realty1;

    public Fund(){
        stock1 = new Stock1();
        stock2 = new Stock2();
        stock3 = new Stock3();
        debt1 = new NationalDebt1();
        realty1 = new Realty1();
    }

    // 买基金
    public void buyFund(){
        stock1.buy();
        stock2.buy();
        stock3.buy();
        debt1.buy();
        realty1.buy();
    }

    // 卖基金
    public void sellFund(){
        stock1.sell();
        stock2.sell();
        stock3.sell();
        debt1.sell();
        realty1.sell();
    }

}
