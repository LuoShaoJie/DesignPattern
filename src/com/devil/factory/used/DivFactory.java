package com.devil.factory.used;

import com.devil.simpleFactory.used.BaseOperation;
import com.devil.simpleFactory.used.OperationDiv;

/**
 * 除法工厂
 * Created by callmeDevil on 2019/7/7.
 */
public class DivFactory implements IFactory{

    @Override
    public BaseOperation createOpertaion() {
        return new OperationDiv();
    }

}
