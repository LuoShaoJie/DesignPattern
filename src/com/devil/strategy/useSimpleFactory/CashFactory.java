package com.devil.strategy.useSimpleFactory;

/**
 * 现金收费工厂类
 * Created by callmeDevil on 2019/6/1.
 */
public class CashFactory {

    /**
     * 创建现金收取工厂实例
     *
     * @param type 收费类型
     * @return
     */
    public static CashSuper createCashAccept(String type) {
        CashSuper cs = null;
        switch (type) {
            case "正常收费":
                cs = new CashNormal();
                break;
            case "满300减100":
                cs = new CashReturn(300, 100);
                break;
            case "打8折":
                cs = new CashRebate(0.8);
                break;
            default:
                break;
        }
        return cs;
    }

}
