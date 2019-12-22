package com.devil.state.used;

/**
 * 傍晚工作状态
 * Created by callmeDevil on 2019/8/3.
 */
public class EveningState extends State {
    @Override
    public void writeProgram(Work work) {
        if (work.isTaskFinished()) {
            // 如果完成任务，转入下班状态
            work.setState(new RestState());
        } else {
            if (work.getHour() < 21) {
                System.out.println(String.format("当前时间：%s点，加班哦，疲累至极", work.getHour()));
            } else {
                // 超过21点，转入睡眠工作状态
                work.setState(new SleepingState());
                work.writeProgram();
            }
        }
    }
}
