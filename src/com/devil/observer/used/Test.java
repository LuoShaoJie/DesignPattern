package com.devil.observer.used;

/**
 * Created by callmeDevil on 2019/7/27.
 */
public class Test {

    public static void main(String[] args) {
        // 老板
        Boss boss = new Boss();

        // 看股票的同事
        StockObserver observer1 = new StockObserver("哪路托", boss);
        // 看NBA的同事
        NBAObserver observer2 = new NBAObserver("啥事gay", boss);

        boss.attach(observer1);
        boss.attach(observer2);

        boss.detach(observer1); // 哪路托主角光环！斑怎么样都打不过！所以减去

        // 斑复活了！
        boss.setAction("我宇智波斑复活了！");
        // 发出通知
        boss.call();
    }

}
