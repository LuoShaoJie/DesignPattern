package com.devil.state.used;

/**
 * 工作类，此时没有了过长的分支判断语句
 * Created by callmeDevil on 2019/8/3.
 */
public class Work {

    private State current;
    private int hour; // 时间，状态转换的依据
    private boolean taskFinished; // 任务完成，是否能下班的依据

    public Work(){
        // 工作初始化为上午工作状态，即上午9点开始上班
        current = new ForenoonState();
    }

    public void writeProgram(){
        current.writeProgram(this);
    }

    public State getState() {
        return current;
    }

    public void setState(State current) {
        this.current = current;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public boolean isTaskFinished() {
        return taskFinished;
    }

    public void setTaskFinished(boolean taskFinished) {
        this.taskFinished = taskFinished;
    }

}
