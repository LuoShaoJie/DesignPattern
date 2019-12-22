package com.devil.responsibility;

/**
 * 经理
 * Created by callmeDevil on 2019/12/14.
 */
public class CommonManager extends Manager {

    public CommonManager(String name) {
        super(name);
    }

    @Override
    public void requestApplications(Request request) {
        // 经理的权限可以批准2天内的假期
        if ("请假".equals(request.getRequestType()) && request.getNumber() <= 2) {
            System.out.println(String.format("%s : %s 数量%s 被批准", name, request.getRequestContent(), request.getNumber()));
        } else {
            // 其余申请转交上级
            if (superior != null) {
                superior.requestApplications(request);
            }
        }
    }

}
