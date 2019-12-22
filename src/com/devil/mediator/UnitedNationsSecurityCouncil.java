package com.devil.mediator;

/**
 * 联合国安全理事会
 * Created by callmeDevil on 2019/12/15.
 */
public class UnitedNationsSecurityCouncil extends UnitedNations{

    // 美国
    private USA colleague1;
    // 伊拉克
    private Iraq colleague2;

    public USA getColleague1() {
        return colleague1;
    }

    public void setColleague1(USA colleague1) {
        this.colleague1 = colleague1;
    }

    public Iraq getColleague2() {
        return colleague2;
    }

    public void setColleague2(Iraq colleague2) {
        this.colleague2 = colleague2;
    }

    @Override
    public void declare(String message, Country colleague) {
        // 重写声明方法，实现了两个对象之间的通信
        if (colleague == colleague1) {
            colleague2.getMessage(message);
        } else {
            colleague1.getMessage(message);
        }
    }

}
