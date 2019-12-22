package com.devil.visitor;

/**
 * 男人
 * Created by callmeDevil on 2019/12/22.
 */
public class Man extends Person{
    @Override
    public void accept(Action visitor) {
        // 首先在客户端程序中将具体状态作为参数传递给“男人”类完成了一次分派，然后“男人”类调用
        // 作为参数的“具体状态”中的方法“男人反应”，同时将自己（this）作为参数传递进去，这便完成
        // 了第二次分派。这种技术手段称为“双分派”。
        visitor.getManConclusion(this);
    }
}
