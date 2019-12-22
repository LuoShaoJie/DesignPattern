package com.devil.command;

/**
 * 抽象命令
 * Created by callmeDevil on 2019/12/14.
 */
public abstract class Command {

    protected Barbecuer receiver;

    public Command(Barbecuer receiver){
        this.receiver = receiver;
    }

    // 执行命令
    public abstract void excuteCommand();

}
