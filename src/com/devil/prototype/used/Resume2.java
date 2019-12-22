package com.devil.prototype.used;

/**
 * 简历类2（深复制）
 * Created by callmeDevil on 2019/7/13.
 */
public class Resume2 implements Cloneable{

    private String name;
    private String sex;
    private String age;
    // 工作经历
    private WorkExperience work;

    public Resume2 (String name) {
        this.name = name;
        this.work = new WorkExperience();
    }

    private Resume2(WorkExperience work) throws CloneNotSupportedException {
        this.work = new WorkExperience();
//        this.work = (WorkExperience) work.clone();
    }

    /**
     * 设置个人信息
     * @param sex
     * @param age
     */
    public void setPersonalInfo(String sex, String age){
        this.sex = sex;
        this.age = age;
    }

    /**
     * 设置工作经历
     * @param timeArea
     * @param company
     */
    public void setWorkExperience(String timeArea, String company) {
        // 此处赋值给 work 对象
        this.work.setWorkDate(timeArea);
        this.work.setCompany(company);
    }

    /**
     * 显示
     */
    public void display () {
        System.out.println(String.format("%s %s %s", name, sex, age));
        // 此处显示 work 对象的值
        System.out.println(String.format("工作经历：%s %s", work.getWorkDate(), work.getCompany()));
    }

    /**
     * 实现克隆方法，可进行自己的克隆逻辑
     * @return
     * @throws CloneNotSupportedException
     */
    @Override
    protected Object clone() throws CloneNotSupportedException {
        // 调用私有的构造方法，让“工作经历”对象克隆完成，然后再给这个“简历”对象
        // 相关的字段赋值，最终返回一个深复制的简历对象
//        Resume2 obj = new Resume2(this.work);
//        obj.setName(this.name);
//        obj.setSex(this.sex);
//        obj.setAge(this.age);
//        return obj;
        return super.clone();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

}
