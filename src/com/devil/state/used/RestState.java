package com.devil.state.used;

/**
 * 下班工作状态
 * Created by callmeDevil on 2019/8/3.
 */
public class RestState extends State{
    @Override
    public void writeProgram(Work work) {
        System.out.println(String.format("当前时间：%s点，下班回家了", work.getHour()));
    }
}
