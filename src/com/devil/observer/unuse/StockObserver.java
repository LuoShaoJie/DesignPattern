package com.devil.observer.unuse;

/**
 * 看股票同事
 * Created by callmeDevil on 2019/7/27.
 */
public class StockObserver {

    private String name;
    private Secretary sub;

    public StockObserver(String name, Secretary sub){
        this.name = name;
        this.sub = sub;
    }

    public void update(){
        System.out.println(String.format("%s %s 关闭股票行情，继续工作！", sub.getAction(), name));
    }

}
