package com.devil.bridge;

/**
 * 手机品牌
 * Created by callmeDevil on 2019/12/14.
 */
public abstract class HandsetBrand {

    protected HandsetSoft soft;

    // 设置手机软件
    public void setHandsetSort(HandsetSoft sort){ // 品牌需要关注软件，所以可在机器中安装软件，以备运行
        this.soft = sort;
    }

    public abstract void run();

}
