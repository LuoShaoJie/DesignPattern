package com.devil.facade.unuse;

/**
 * 炒股测试
 * Created by callmeDevil on 2019/7/20.
 */
public class Test {

    public static void main(String[] args) {
        Stock1 stock1 = new Stock1();
        Stock2 stock2 = new Stock2();
        Stock3 stock3 = new Stock3();
        NationalDebt1 debt1 = new NationalDebt1();
        Realty1 realty1 = new Realty1();

        // 用户需要了解股票、国债、房地产情况，需要参与这些项目的具体买卖，耦合性很高
        stock1.buy();
        stock2.buy();
        stock3.buy();
        debt1.buy();
        realty1.buy();

        stock1.sell();
        stock2.sell();
        stock3.sell();
        debt1.sell();
        realty1.sell();
    }

}
