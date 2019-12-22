package com.devil.templateMethod.used;

/**
 * 学生甲抄的试卷-模板方法实现
 * Created by callmeDevil on 2019/7/14.
 */
public class TestPaperA3 extends TestPaper{

    @Override
    public String answer1() {
        return "b";
    }

    @Override
    public String answer2() {
        return "b";
    }

}
