package com.devil.state.used;

/**
 * 上午工作状态
 * Created by callmeDevil on 2019/8/3.
 */
public class ForenoonState extends State{
    @Override
    public void writeProgram(Work work) {
        if (work.getHour() < 12) {
            System.out.println(String.format("当前时间：%s点，上午工作，精神百倍", work.getHour()));
        } else {
            // 超过12点，转入中午工作状态
            work.setState(new NoonState());
            work.writeProgram();
        }
    }
}
