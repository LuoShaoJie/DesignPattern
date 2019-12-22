package com.devil.component.uml_demo;

/**
 * 叶节点对象
 * Created by callmeDevil on 2019/8/11.
 */
public class Leaf extends Component {

    public Leaf(String name) {
        super(name);
    }

    @Override
    public void add(Component c) {
        System.out.println("cannot add to a leaf");
    }

    @Override
    public void remove(Component c) {
        System.out.println("cannot remove from a leaf");
    }

    @Override
    public void dispaly(int depth) {
        StringBuilder sb = new StringBuilder(depth);
        for (int i = 0; i < depth; i++) {
            sb.append("-");
        }
        // 显示名称和级别
        System.out.println(String.format("%s %s", sb.toString(), name));
    }

}
