package com.devil.command;

/**
 * 服务员
 * Created by callmeDevil on 2019/12/14.
 */
public class Waiter {

    private Command command;

    // 不管什么用户想要什么烤肉，反正都是命令，只管记录订单，然后通知烤肉串者即可
    public void setOrder(Command command){
        this.command = command;
    }

    public void notifying(){
        command.excuteCommand();
    }

}
