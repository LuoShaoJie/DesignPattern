package com.devil.command;

/**
 * Created by callmeDevil on 2019/12/14.
 */
public class Test {
    public static void main(String[] args) {
        // 开店前的准备
        Barbecuer boy = new Barbecuer();
        Command bakeMuttonCommand1 = new BakeMuttonCommand(boy);
        Command bakeMuttonCommand2 = new BakeMuttonCommand(boy);
        BakeChickenWingCommand bakeChickenWingCommand1 = new BakeChickenWingCommand(boy);
        Waiter girl = new Waiter();

        // 开门营业
        girl.setOrder(bakeMuttonCommand1);
        girl.notifying();
        girl.setOrder(bakeMuttonCommand2);
        girl.notifying();
        girl.setOrder(bakeChickenWingCommand1);
        girl.notifying();
    }
}
