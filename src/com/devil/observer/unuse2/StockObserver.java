package com.devil.observer.unuse2;

/**
 * 看股票的同事
 * Created by callmeDevil on 2019/7/27.
 */
public class StockObserver extends Observer {

    public StockObserver(String name, Secretary sub) {
        super(name, sub);
    }

    @Override
    public void update(){
        System.out.println(String.format("%s %s 关闭股票行情，继续工作！", sub.getAction(), name));
    }

}
