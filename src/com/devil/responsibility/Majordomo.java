package com.devil.responsibility;

/**
 * 总监
 * Created by callmeDevil on 2019/12/14.
 */
public class Majordomo extends Manager {

    public Majordomo(String name) {
        super(name);
    }

    @Override
    public void requestApplications(Request request) {
        // 总监的权限可以批准5天内的假期
        if ("请假".equals(request.getRequestType()) && request.getNumber() <= 5) {
            System.out.println(String.format("%s : %s 数量%s 被批准", name, request.getRequestContent(), request.getNumber()));
        } else {
            // 其余申请转交上级
            if (superior != null) {
                superior.requestApplications(request);
            }
        }
    }

}
