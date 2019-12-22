package com.devil.simpleFactory.used;

/**
 * 减法运算
 * Created by callmeDevil on 2019/5/26.
 */
public class OperationSub extends BaseOperation {

    @Override
    public double getResult() {
        return getNumA() - getNumB();
    }

}
