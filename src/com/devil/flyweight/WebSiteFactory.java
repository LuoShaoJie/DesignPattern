package com.devil.flyweight;

import java.util.HashMap;

/**
 * 网站工厂
 * Created by callmeDevil on 2019/12/15.
 */
public class WebSiteFactory {

    private HashMap<String, WebSite> flyweights = new HashMap<>();

    // 获得网站分类
    public WebSite getWebSiteCategory(String key){
        // 判断是否存在这个对象，如果存在则直接返回，若不存在则实例化再返回
        if (!flyweights.containsKey(key)) {
            flyweights.put(key, new ConcreteWebSite(key));
        }
        return flyweights.get(key);
    }

    // 获得网站分类总数
    public int getWebSiteCount(){
        return flyweights.size();
    }

}
