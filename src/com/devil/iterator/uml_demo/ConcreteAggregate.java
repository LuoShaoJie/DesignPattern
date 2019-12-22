package com.devil.iterator.uml_demo;

import java.util.ArrayList;
import java.util.List;

/**
 * 具体聚集类
 * Created by callmeDevil on 2019/8/17.
 */
public class ConcreteAggregate extends Aggregate {

    // 存放聚合对象
    private List<Object> items = new ArrayList();

    @Override
    public Iterator createIterator() {
        return new ConcreteIterator(this);
    }

    // 返回聚集的总个数
    public int count() {
        return items.size();
    }

    // 声明一个索引器
    public Object get(int index) {
        return items.get(index);
    }
    public boolean set(Object o) {
        return items.add(o);
    }

}

