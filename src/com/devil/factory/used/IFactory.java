package com.devil.factory.used;

import com.devil.simpleFactory.used.BaseOperation;

/**
 * 工厂接口
 * Created by callmeDevil on 2019/7/7.
 */
public interface IFactory {
    /**
     * 创建运算类
     *
     * @return
     */
    BaseOperation createOpertaion();
}
