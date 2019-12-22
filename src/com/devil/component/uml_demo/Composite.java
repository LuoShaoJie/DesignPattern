package com.devil.component.uml_demo;

import java.util.ArrayList;
import java.util.List;

/**
 * 枝节点行为，用来存储子部件
 * Created by callmeDevil on 2019/8/11.
 */
public class Composite extends Component{

    // 一个子对象集合用来存储其下属枝节点和叶节点
    private List<Component> children = new ArrayList<>();

    public Composite(String name){
        super(name);
    }

    @Override
    public void add(Component c) {
        children.add(c);
    }

    @Override
    public void remove(Component c) {
        children.remove(c);
    }

    @Override
    public void dispaly(int depth) {
        StringBuilder sb = new StringBuilder(depth);
        for (int i = 0; i < depth; i++) {
            sb.append("-");
        }
        // 显示枝节点名称，并对其下级进行遍历
        System.out.println(String.format("%s %s", sb.toString(), name));
        for (Component child : children) {
            child.dispaly(depth + 3);
        }
    }

}
