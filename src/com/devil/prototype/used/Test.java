package com.devil.prototype.used;

/**
 * 原型模式测试
 * Created by callmeDevil on 2019/7/13.
 */
public class Test {

    public static void main(String[] args) throws CloneNotSupportedException {
        Resume resumeA = new Resume("callmeDevil");
        resumeA.setPersonalInfo("男", "24");
        resumeA.setWorkExperience("2018-2019", "伟大的航道");

        // 只需要调用clone方法就可以实现新简历的生成，并且可以修改新简历的细节
        Resume resumeB = (Resume) resumeA.clone();
        resumeB.setWorkExperience("2019-2020", "新世界");

        Resume resumeC = (Resume) resumeA.clone();
        resumeC.setPersonalInfo("男", "25");

        resumeA.display();
        resumeB.display();
        resumeC.display();

        //============================================================================
        System.out.println("123" == "123");
        System.out.println("123".equals("123"));
        System.out.println(new String("123") == new String("123"));
        System.out.println(new String("123").equals(new String("123")));

        System.out.println(resumeA.getCompany() == resumeC.getCompany());
        System.out.println(resumeA.getCompany().equals(resumeC.getCompany()));
    }

}
