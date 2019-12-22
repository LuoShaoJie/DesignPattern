package com.devil.prototype.unuse;

/**
 * 原型模式简单实现测试
 * Created by callmeDevil on 2019/7/13.
 */
public class Test {

    public static void main(String[] args) {
        Resume resumeA = new Resume("callmeDevil");
        resumeA.setPersonalInfo("男", "24");
        resumeA.setWorkExperience("2018-2019", "伟大的航道");

        Resume resumeB = new Resume("callmeDevil");
        resumeB.setPersonalInfo("男", "24");
        resumeB.setWorkExperience("2018-2019", "伟大的航道");

        Resume resumeC = new Resume("callmeDevil");
        resumeC.setPersonalInfo("男", "24");
        resumeC.setWorkExperience("2018-2019", "伟大的航道");

        resumeA.display();
        resumeB.display();
        resumeC.display();
    }

}
