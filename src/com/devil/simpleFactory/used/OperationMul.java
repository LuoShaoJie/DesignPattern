package com.devil.simpleFactory.used;

/**
 * 乘法运算
 * Created by callmeDevil on 2019/5/26.
 */
public class OperationMul extends BaseOperation {

    @Override
    public double getResult() {
        return getNumA() * getNumB();
    }

}
