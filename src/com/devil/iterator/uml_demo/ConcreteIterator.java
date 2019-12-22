package com.devil.iterator.uml_demo;

/**
 * 具体迭代器类
 * Created by callmeDevil on 2019/8/17.
 */
public class ConcreteIterator extends Iterator {

    // 定义一个具体聚集对象
    private ConcreteAggregate aggregate;
    private int current = 0;

    public ConcreteIterator(ConcreteAggregate aggregate){
        // 初始化时将具体的聚集对象传入
        this.aggregate = aggregate;
    }

    @Override
    public Object first() {
        // 得到聚集的第一个对象
        return aggregate.get(0);
    }

    @Override
    public Object next() {
        Object ret = null;
        current++;
        if (current < aggregate.count()) {
            // 得到聚集的下一个对象
            ret = aggregate.get(current);
        }
        return ret;
    }

    @Override
    public boolean isDone() {
        // 判断当前是否遍历到结尾
        return current >= aggregate.count();
    }

    @Override
    public Object currentItem() {
        // 返回当前的聚集对象
        return aggregate.get(current);
    }

}
