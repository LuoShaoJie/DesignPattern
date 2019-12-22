package com.devil.prototype.used;

/**
 * 深复制测试
 * Created by callmeDevil on 2019/7/13.
 */
public class TestDeepClone {

    public static void main(String[] args) throws CloneNotSupportedException {
        Resume2 resumeA = new Resume2("callmeDevil");
        resumeA.setPersonalInfo("男", "24");
        resumeA.setWorkExperience("2018-2019", "伟大的航道");

        Resume2 resumeB = (Resume2) resumeA.clone();
        resumeB.setWorkExperience("2019-2020", "新世界");

        Resume2 resumeC = (Resume2) resumeA.clone();
        resumeC.setWorkExperience("2020-XXXX", "木叶忍者村");

        resumeA.display();
        resumeB.display();
        resumeC.display();
    }

}
