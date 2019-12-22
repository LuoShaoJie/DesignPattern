package com.devil.templateMethod.used;

/**
 * 动漫考题-模板方法父类
 * Created by callmeDevil on 2019/7/14.
 */
public abstract class TestPaper {

    // 试题1
    public void testQuestion1(){
        System.out.println("路飞在顶上战争之后，修炼了多久？ a.3天 b.2年 c.2天 d.3年");
        System.out.println("答案：" + answer1());//改成一个虚方法，下同
    }

    // 试题2
    public void testQuestion2(){
        System.out.println("鸣人是第几代火影？ a.六代 b.七代 c.八代 d.九代");
        System.out.println("答案：" + answer2());
    }

    // 此方法的目的就是给继承的子类重写，因为这里每个人的答案都是不同的
    public abstract String answer1();
    public abstract String answer2();

}
