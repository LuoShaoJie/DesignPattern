package com.devil.flyweight;

/**
 * Created by callmeDevil on 2019/12/15.
 */
public class Test {
    public static void main(String[] args) {
        WebSiteFactory factory = new WebSiteFactory();

        WebSite fx = factory.getWebSiteCategory("产品展示");
        fx.use(new User("路飞"));

        // 共享上方生成的对象，不再实例化
        WebSite fy = factory.getWebSiteCategory("产品展示");
        fy.use(new User("索隆"));

        WebSite fz = factory.getWebSiteCategory("产品展示");
        fz.use(new User("山治"));

        WebSite fl = factory.getWebSiteCategory("博客");
        fl.use(new User("娜美"));

        WebSite fm = factory.getWebSiteCategory("博客");
        fm.use(new User("乌索普"));

        WebSite fn = factory.getWebSiteCategory("博客");
        fn.use(new User("乔巴"));

        // 统计实例化个数，结果应为2
        System.out.println("网站分类总数为：" + factory.getWebSiteCount());
    }
}
