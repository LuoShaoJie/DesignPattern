package com.devil.adapter.used;

/**
 * 外籍中锋
 * Created by callmeDevil on 2019/8/4.
 */
public class ForeignCenter {

    // 外籍中锋球员的姓名故意用属性而不是构造方法来区别与三个球员的不同
    private String name;

    // 表明外籍中锋只懂中文“进攻”（注意：举例效果，实际上千万别用这种方式编程）
    public void 进攻(){
        System.out.println(String.format("外籍中锋 %s 进攻", name));
    }

    // 表明外籍中锋只懂中文“进攻”（注意：举例效果，实际上千万别用这种方式编程）
    public void 防守(){
        System.out.println(String.format("外籍中锋 %s 防守", name));
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
