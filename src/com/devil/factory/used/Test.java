package com.devil.factory.used;

import com.devil.simpleFactory.used.BaseOperation;

/**
 * 工厂方法模式测试
 * Created by callmeDevil on 2019/7/7.
 */
public class Test {

    public static void main(String[] args) {
        IFactory operFactory = new AddFactory();
        BaseOperation oper = operFactory.createOpertaion();
        oper.setNumA(1);
        oper.setNumB(2);
        double result = oper.getResult();
        System.out.println("加法测试结果：" + result);
    }

}
