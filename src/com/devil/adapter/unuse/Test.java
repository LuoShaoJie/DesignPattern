package com.devil.adapter.unuse;

/**
 * Created by callmeDevil on 2019/8/4.
 */
public class Test {
    public static void main(String[] args) {
        Player b = new Forwards("巴蒂尔");
        b.attack();
        Player m = new Guards("麦克格雷迪");
        m.attack();

        Player ym = new Center("姚明");
        // 姚明问：attack 和 defense 是什么意思？
        ym.attack();
        ym.defense();
    }
}
