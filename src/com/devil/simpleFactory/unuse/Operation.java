package com.devil.simpleFactory.unuse;

/**
 * 运算类
 * Created by callmeDevil on 2019/5/26.
 */
public class Operation {

    /**
     * 获取运算结果
     * @param numA 数值A
     * @param numB 数值B
     * @param operate 运算符
     * @return
     */
    public static double getResult(double numA, double numB, String operate) {
        double result = 0L;
        switch (operate) {
            case "+":
                result = numA + numB;
                break;
            case "-":
                result = numA - numB;
                break;
            case "*":
                result = numA * numB;
                break;
            case "/":
                result = numA / numB;
                break;
            default:
                break;
        }
        return result;
    }

}
