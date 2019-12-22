package com.devil.state.used;

/**
 * 睡眠工作状态
 * Created by callmeDevil on 2019/8/3.
 */
public class SleepingState extends State{
    @Override
    public void writeProgram(Work work) {
        System.out.println(String.format("当前时间：%s点，不行了，睡着了", work.getHour()));
    }
}
