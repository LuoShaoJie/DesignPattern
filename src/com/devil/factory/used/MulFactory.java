package com.devil.factory.used;

import com.devil.simpleFactory.used.BaseOperation;
import com.devil.simpleFactory.used.OperationMul;

/**
 * 乘法工厂
 * Created by callmeDevil on 2019/7/7.
 */
public class MulFactory implements IFactory{

    @Override
    public BaseOperation createOpertaion() {
        return new OperationMul();
    }

}
