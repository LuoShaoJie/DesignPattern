package com.devil.facade.used;

/**
 * 基金测试（外观模式）
 * Created by callmeDevil on 2019/7/20.
 */
public class Test {

    public static void main(String[] args) {
        // 此时用户不需要了解股票，甚至可以对股票一无所知，买了基金就回家睡觉
        // 一段时间后再赎回就可以大把数钱，参与股票的具体买卖都有基金公司完成
        // 客户端代码非常简洁明了
        Fund fund = new Fund();
        // 购买基金
        fund.buyFund();
        // 基金赎回
        fund.sellFund();
    }

}
