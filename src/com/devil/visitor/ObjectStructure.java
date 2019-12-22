package com.devil.visitor;

import java.util.ArrayList;
import java.util.List;

/**
 * 对象结构
 * Created by callmeDevil on 2019/12/22.
 */
public class ObjectStructure {

    private List<Person> elements = new ArrayList<>();

    // 增加
    public void attach(Person element) {
        elements.add(element);
    }

    // 移除
    public void detach(Person element) {
        elements.remove(element);
    }

    // 查看显示
    public void display(Action visitor) {
        for (Person element : elements) {
            element.accept(visitor);
        }
    }

}
