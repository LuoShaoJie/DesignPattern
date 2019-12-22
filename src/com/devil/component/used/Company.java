package com.devil.component.used;

/**
 * 公司抽象类
 * Created by callmeDevil on 2019/8/11.
 */
public abstract class Company {

    protected String name;

    public Company(String name){
        this.name = name;
    }

    public abstract void add(Company c);
    public abstract void remove(Company c);
    public abstract void dispaly(int depth);
    public abstract void lineOfDuty(); // 履行职责，不同部门需要履行不同的职责

    // 用于输出层次结构，非必须，与模式无关
    public String getDepth(int depth){
        StringBuilder sb = new StringBuilder(depth);
        for (int i = 0; i < depth; i++) {
            sb.append("-");
        }
        return sb.toString();
    }

}
