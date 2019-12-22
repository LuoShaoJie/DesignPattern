package com.devil.component.used;

/**
 * 人力资源部（树叶节点）
 * Created by callmeDevil on 2019/8/11.
 */
public class HRDepartment extends Company{

    public HRDepartment(String name){
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
        System.out.println(String.format("%s 员工招聘培训管理", name));
    }

}
