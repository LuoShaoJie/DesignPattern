package com.devil.observer.unuse2;

/**
 * 看NBA 的同事
 * Created by callmeDevil on 2019/7/27.
 */
public class NBAObserver extends Observer {

    public NBAObserver(String name, Secretary sub) {
        super(name, sub);
    }

    @Override
    public void update() {
        System.out.println(String.format("%s %s 关闭NBA 直播，继续工作！", sub.getAction(), name));
    }

}
