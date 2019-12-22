package com.devil.iterator.uml_demo;

/**
 * 迭代器抽象类
 * Created by callmeDevil on 2019/8/17.
 */
public abstract class Iterator {
    // 用于定义得到开始对象、得到下一对象、判断是否到结尾、当前对象等抽象方法
    public abstract Object first();
    public abstract Object next();
    public abstract boolean isDone();
    public abstract Object currentItem();
}
