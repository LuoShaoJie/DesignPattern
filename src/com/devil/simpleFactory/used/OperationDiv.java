package com.devil.simpleFactory.used;

/**
 * 除法运算
 * Created by callmeDevil on 2019/5/26.
 */
public class OperationDiv extends BaseOperation {

    @Override
    public double getResult() {
        if (getNumB() == 0){
            throw new RuntimeException("除数不能为0！");
        }
        return getNumA() / getNumB();
    }

}
