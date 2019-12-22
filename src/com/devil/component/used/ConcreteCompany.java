package com.devil.component.used;

import java.util.ArrayList;
import java.util.List;

/**
 * 具体公司（树枝节点）
 * Created by callmeDevil on 2019/8/11.
 */
public class ConcreteCompany extends Company {

    private List<Company> children = new ArrayList<>();

    public ConcreteCompany(String name) {
        super(name);
    }

    @Override
    public void add(Company c) {
        children.add(c);
    }

    @Override
    public void remove(Company c) {
        children.remove(c);
    }

    @Override
    public void dispaly(int depth) {
        System.out.println(String.format("%s %s", getDepth(depth), name));
        for (Company child : children) {
            child.dispaly(depth + 3);
        }
    }

    @Override
    public void lineOfDuty() {
        for (Company child : children) {
            child.lineOfDuty();
        }
    }

}
