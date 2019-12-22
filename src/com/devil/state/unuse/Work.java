package com.devil.state.unuse;

/**
 * 工作类
 * Created by callmeDevil on 2019/8/3.
 */
public class Work {

    private int hour;
    private boolean finish = false;

    public void writeProgram() {
        if (hour < 12) {
            System.out.println(String.format("当前时间：%s点，上午工作，精神百倍", hour));
        } else if (hour < 13) {
            System.out.println(String.format("当前时间：%s点，饿了，午饭；犯困，午休", hour));
        } else if (hour < 17) {
            System.out.println(String.format("当前时间：%s点，下午状态还不错，继续努力", hour));
        } else {
            if (finish) {
                System.out.println(String.format("当前时间：%s点，下班回家了", hour));
            } else {
                if (hour < 21) {
                    System.out.println(String.format("当前时间：%s点，加班哦，疲累至极", hour));
                } else {
                    System.out.println(String.format("当前时间：%s点，不行了，睡着了", hour));
                }
            }
        }
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public boolean isFinish() {
        return finish;
    }

    public void setFinish(boolean finish) {
        this.finish = finish;
    }

}
