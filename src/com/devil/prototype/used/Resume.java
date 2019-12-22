package com.devil.prototype.used;

/**
 * 简历类（实现JDK克隆接口）
 * Created by callmeDevil on 2019/7/13.
 */
public class Resume implements Cloneable{

    private String name;
    private String sex;
    private String age;
    private String timeArea;
    private String company;

    public Resume (String name) {
        this.name = name;
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
        this.timeArea = timeArea;
        this.company = company;
    }

    /**
     * 显示
     */
    public void display () {
        System.out.println(String.format("%s %s %s", name, sex, age));
        System.out.println(String.format("工作经历：%s %s", timeArea, company));
    }

    /**
     * 实现克隆方法，可进行自己的克隆逻辑
     * @return
     * @throws CloneNotSupportedException
     */
    @Override
    protected Object clone() throws CloneNotSupportedException {
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

    public String getTimeArea() {
        return timeArea;
    }

    public void setTimeArea(String timeArea) {
        this.timeArea = timeArea;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

}
