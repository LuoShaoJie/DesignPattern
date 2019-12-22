package com.devil.responsibility;

/**
 * 总经理
 * Created by callmeDevil on 2019/12/14.
 */
public class GeneralManager extends Manager {

    public GeneralManager(String name) {
        super(name);
    }

    @Override
    public void requestApplications(Request request) {
        // 总经理可以批准任意天的假期
        if ("请假".equals(request.getRequestType())) {
            System.out.println(String.format("%s : %s 数量%s 被批准", name, request.getRequestContent(), request.getNumber()));
        }
        // 加薪在500内，没问题
        else if ("加薪".equals(request.getRequestType()) && request.getNumber() <= 500) {
            System.out.println(String.format("%s : %s 数量%s 被批准", name, request.getRequestContent(), request.getNumber()));
        }
        // 加薪超过500要考虑一下
        else if ("加薪".equals(request.getRequestType()) && request.getNumber() > 500) {
            System.out.println(String.format("%s : %s 数量%s 再说吧", name, request.getRequestContent(), request.getNumber()));
        }
    }

}
