package com.devil.simpleFactory.used;

/**
 * 运算工厂
 * Created by callmeDevil on 2019/5/26.
 */
public class OperationFactory {

    /**
     * 获取运算实例
     * @param operate 运算符
     * @return
     */
    public static BaseOperation createOperation(String operate) {
        BaseOperation operation = null;
        switch (operate) {
            case "+":
                operation = new OperationAdd();
                break;
            case "-":
                operation = new OperationSub();
                break;
            case "*":
                operation = new OperationMul();
                break;
            case "/":
                operation = new OperationDiv();
                break;
            default:
                break;
        }
        return operation;
    }

}
