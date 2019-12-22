package com.devil.visitor;

/**
 * Created by callmeDevil on 2019/12/22.
 */
public class Test {
    public static void main(String[] args) {
        ObjectStructure obj = new ObjectStructure();
        // 对象结构中加入要对比的男人和女人
        obj.attach(new Man());
        obj.attach(new Woman());

        // 成功的反应
        Success success = new Success();
        obj.display(success);

        // 失败的反应
        Failing failing = new Failing();
        obj.display(failing);

        // 恋爱的反应
        Amativeness amativeness = new Amativeness();
        obj.display(amativeness);
    }
}
