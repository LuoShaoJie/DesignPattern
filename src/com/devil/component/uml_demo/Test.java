package com.devil.component.uml_demo;

/**
 * Created by callmeDevil on 2019/8/11.
 */
public class Test {
    public static void main(String[] args) {
        // 生成树根root，根上长出两叶LeafA 和LeafB
        Composite root = new Composite("root");
        root.add(new Leaf("Leaf A"));
        root.add(new Leaf("Leaf B"));
        // 根上长出分枝 Composite X ，分枝上也有两叶LeafXA 和LeafXB
        Composite comp = new Composite("Composite X");
        comp.add(new Leaf("Leaf XA"));
        comp.add(new Leaf("Leaf XB"));
        root.add(comp);
        // 分枝 Composite X上再长出分枝 Composite XY ，分枝上也有两叶Leaf XYA 和Leaf XYB
        Composite comp2 = new Composite("Composite XY");
        comp2.add(new Leaf("Leaf XYA"));
        comp2.add(new Leaf("Leaf XYB"));
        comp.add(comp2);
        // 根部又长出两叶LeafC 和LeafD，可惜LeafD没长牢，被风吹走了
        root.add(new Leaf("Leaf C"));
        Leaf leafD = new Leaf("Leaf D");
        root.add(leafD);
        root.remove(leafD);
        // 显示大树
        root.dispaly(1);
    }
}
