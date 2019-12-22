package com.devil.prototype.used;

/**
 * Created by callmeDevil on 2019/7/13.
 */
public class Test2 {

    public static void main(String[] args) throws CloneNotSupportedException {
        Resume resumeA = new Resume("callmeDevil");
        resumeA.setWorkExperience("0", "伟大的航道");// 直接声明String

        Resume resumeB = (Resume) resumeA.clone();

        // A 与 B 的公司两种比较
        System.out.println(resumeA.getCompany() == resumeB.getCompany());
        System.out.println(resumeA.getCompany().equals(resumeB.getCompany()));

        resumeA.setWorkExperience("0", new String("伟大的航道"));//new 的方式创建String

        Resume resumeC = (Resume) resumeA.clone();

        // A 与 C 的公司两种比较
        System.out.println(resumeA.getCompany() == resumeC.getCompany());
        System.out.println(resumeA.getCompany().equals(resumeC.getCompany()));
    }

}
