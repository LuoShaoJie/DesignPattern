package com.devil.iterator.uml_demo;

/**
 * Created by callmeDevil on 2019/8/17.
 */
public class Test {
    public static void main(String[] args) {
        // 公交车聚集对象
        ConcreteAggregate a = new ConcreteAggregate();
        // 新上来的乘客
        a.set("路飞");
        a.set("鸣人");
        a.set("一护");
        a.set("悟空");
        a.set("纳兹");
        a.set("琦玉");
        // 售票员登场，看好上车的是哪些人，即声明迭代器对象
        Iterator i = new ConcreteIterator(a);
        System.out.println(String.format("车位No.1乘客：%s", i.first()));
        while (!i.isDone()){
            System.out.println(String.format("%s 来不及解释了，快上车！", i.currentItem()));
            i.next();
        }
    }
}
