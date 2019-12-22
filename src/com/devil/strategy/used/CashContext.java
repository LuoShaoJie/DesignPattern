package com.devil.strategy.used;

import com.devil.strategy.useSimpleFactory.CashNormal;
import com.devil.strategy.useSimpleFactory.CashRebate;
import com.devil.strategy.useSimpleFactory.CashReturn;
import com.devil.strategy.useSimpleFactory.CashSuper;

/**
 * 现金上下文
 * Created by callmeDevil on 2019/6/1.
 */
public class CashContext {

    private CashSuper cs = null;

    public CashContext(String type) {
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
    }

    public double getResult(double money) {
        return cs.acceptCash(money);
    }

}
