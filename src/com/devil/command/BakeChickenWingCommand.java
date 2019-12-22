package com.devil.command;

/**
 * 烤鸡翅命令
 * Created by callmeDevil on 2019/12/14.
 */
public class BakeChickenWingCommand extends Command{

    public BakeChickenWingCommand(Barbecuer receiver){
        super(receiver);
    }

    @Override
    public void excuteCommand() {
        receiver.bakeChickenWing();
    }

}
