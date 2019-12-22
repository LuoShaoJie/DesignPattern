package com.devil.interpretor;

/**
 * 音速类
 * Created by callmeDevil on 2019/12/15.
 */
public class Speed extends Expression{
    @Override
    public void excute(String key, double value) {
        String speed;
        if (value < 500) {
            speed = "快速";
        } else if (value >= 1000) {
            speed = "慢速";
        } else {
            speed = "中速";
        }
        System.out.print(speed + " ");
    }
}
