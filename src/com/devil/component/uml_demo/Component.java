package com.devil.component.uml_demo;

/**
 * 组合对象
 * Created by callmeDevil on 2019/8/11.
 */
public abstract class Component {

    protected String name;

    public Component(String name){
        this.name = name;
    }

    // 通常都用add 和remove 方法来提供增加或移除树叶或树枝的功能
    public abstract void add(Component c);
    public abstract void remove(Component c);
    public abstract void dispaly(int depth);

}
