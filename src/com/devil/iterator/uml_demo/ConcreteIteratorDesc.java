package com.devil.iterator.uml_demo;

/**
 * 倒序具体迭代器
 * Created by callmeDevil on 2019/8/17.
 */
public class ConcreteIteratorDesc extends Iterator{

    // 定义一个具体聚集对象
    private ConcreteAggregate aggregate;
    private int current = 0;

    public ConcreteIteratorDesc(ConcreteAggregate aggregate){
        // 初始化时将具体的聚集对象传入
        this.aggregate = aggregate;
        current = aggregate.count() - 1;  //不同1
    }

    @Override
    public Object first() {
        // 得到聚集的第一个对象
        return aggregate.get(aggregate.count() - 1); //不同2
    }

    @Override
    public Object next() {
        Object ret = null;
        current--;  //不同3
        if (current >= 0) {  //不同4
            // 得到聚集的下一个对象
            ret = aggregate.get(current);
        }
        return ret;
    }

    @Override
    public boolean isDone() {
        // 判断当前是否遍历到结尾
        return current < 0;  //不同5
    }

    @Override
    public Object currentItem() {
        // 返回当前的聚集对象
        return aggregate.get(current);
    }

}
