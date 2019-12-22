package com.devil.prototype.used;

/**
 * 工作经历
 * Created by callmeDevil on 2019/7/13.
 */
public class WorkExperience /*implements Cloneable*/{

    private String workDate;

    private String company;

//    @Override
//    protected Object clone() throws CloneNotSupportedException {
//        return super.clone();
//    }

    public String getWorkDate() {
        return workDate;
    }

    public void setWorkDate(String workDate) {
        this.workDate = workDate;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }
}
