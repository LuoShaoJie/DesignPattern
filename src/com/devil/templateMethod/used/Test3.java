package com.devil.templateMethod.used;

/**
 * 模板方法测试
 * Created by callmeDevil on 2019/7/14.
 */
public class Test3 {

    public static void main(String[] args) {
        System.out.println("学生甲抄的试卷：");
        // 将子类变量的声明改成父类，利用多态性实现了代码的复用
        TestPaper studentA = new TestPaperA3();
        studentA.testQuestion1();
        studentA.testQuestion2();

        System.out.println("学生乙抄的试卷：");
        TestPaper studentB = new TestPaperB3();
        studentB.testQuestion1();
        studentB.testQuestion2();
    }

}
