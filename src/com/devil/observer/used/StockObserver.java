package com.devil.observer.used;

/**
 * 看股票的同事
 * Created by callmeDevil on 2019/7/27.
 */
public class StockObserver extends Observer {

    public StockObserver(String name, Subject sub) { // 原来是“前台MM”，现改成“抽象通知者”
        super(name, sub);
    }

    @Override
    public void update(){
        System.out.println(String.format("%s %s 关闭股票行情，继续工作！", sub.getAction(), name));
    }

}
