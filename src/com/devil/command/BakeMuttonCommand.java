package com.devil.command;

/**
 * 烤羊肉串命令
 * Created by callmeDevil on 2019/12/14.
 */
public class BakeMuttonCommand extends Command{

    public BakeMuttonCommand(Barbecuer receiver){
        super(receiver);
    }

    @Override
    public void excuteCommand() {
        receiver.bakeMutton();
    }

}
