package com.devil.simpleFactory.used;

/**
 * 运算基础类
 * Created by callmeDevil on 2019/5/26.
 */
public class BaseOperation {

    private double numA;
    private double numB;

    public double getNumA() {
        return numA;
    }

    public void setNumA(double numA) {
        this.numA = numA;
    }

    public double getNumB() {
        return numB;
    }

    public void setNumB(double numB) {
        this.numB = numB;
    }

    /**
     * 获取结果
     * @return
     */
    public double getResult() {
        double result = 0L;
        return result;
    }

}
