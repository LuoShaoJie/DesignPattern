package com.devil.decorator.used;

/**
 * 究极进化 服饰类（Decorator）
 * Created by callmeDevil on 2019/6/23.
 */
public abstract class Finery extends Person{

    protected Person component;

    /**
     * 装扮
     * @param component
     */
    public void decorate(Person component) {
        this.component = component;
    }

    @Override
    public void show() {
        if (component != null) {
            component.show();
        }
    }

}
