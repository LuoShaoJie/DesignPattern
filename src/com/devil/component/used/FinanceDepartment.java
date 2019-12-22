package com.devil.component.used;

/**
 * 财务部（树叶节点）
 * Created by callmeDevil on 2019/8/11.
 */
public class FinanceDepartment extends Company{

    public FinanceDepartment(String name){
        super(name);
    }

    @Override
    public void add(Company c) {

    }

    @Override
    public void remove(Company c) {

    }

    @Override
    public void dispaly(int depth) {
        System.out.println(String.format("%s %s", getDepth(depth), name));
    }

    @Override
    public void lineOfDuty() {
        System.out.println(String.format("%s 公司财务收支管理", name));
    }

}
