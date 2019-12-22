package com.devil.observer.unuse;

/**
 * Created by callmeDevil on 2019/7/27.
 */
public class Test {

    public static void main(String[] args) {
        // 前台妹子
        Secretary mm = new Secretary();
        // 看股票的同事
        StockObserver observer1 = new StockObserver("哪路托", mm);
        StockObserver observer2 = new StockObserver("啥是gay", mm);

        // 前台妹子记下两位同事
        mm.attach(observer1);
        mm.attach(observer2);
        // 发现老板
        mm.setAction("老板回来了！");
        // 通知两个同事
        mm.call();
    }

}
