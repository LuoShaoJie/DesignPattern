package com.devil.simpleFactory.used;

/**
 * 测试类
 * Created by callmeDevil on 2019/5/26.
 */
public class Test {

    public static void main(String[] args) {
        // 实现其他运算只需要更改输入的运算符即可
        BaseOperation operation = OperationFactory.createOperation("+");
        operation.setNumA(10);
        operation.setNumB(2);
        System.out.println("加法：" + operation.getResult());
    }

}
