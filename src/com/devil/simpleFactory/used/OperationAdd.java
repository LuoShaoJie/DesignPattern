package com.devil.simpleFactory.used;

/**
 * 加法运算
 * Created by callmeDevil on 2019/5/26.
 */
public class OperationAdd extends BaseOperation {

    @Override
    public double getResult() {
        return getNumA() + getNumB();
    }

}
