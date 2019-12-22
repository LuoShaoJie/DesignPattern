package com.devil.templateMethod.unuse;

/**
 * 学生乙抄的试卷-版本2
 * Created by callmeDevil on 2019/7/14.
 */
public class TestPaperB2 extends TestPaper{

    @Override
    public void testQuestion1(){
        super.testQuestion1();
        System.out.println("答案：a");
    }

    @Override
    public void testQuestion2(){
        super.testQuestion2();
        System.out.println("答案：a");
    }

}
