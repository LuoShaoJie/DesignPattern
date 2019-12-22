package com.devil.responsibility;

/**
 * Created by callmeDevil on 2019/12/14.
 */
public class Test {
    public static void main(String[] args) {
        CommonManager commonManager = new CommonManager("中将");
        Majordomo majordomo = new Majordomo("大将");
        GeneralManager generalManager = new GeneralManager("元帅");
        // 设置上级
        commonManager.setSuperior(majordomo);
        majordomo.setSuperior(generalManager);

        Request request = new Request();
        request.setRequestType("请假");
        request.setRequestContent("不给请假我不干了");
        request.setNumber(1);
        commonManager.requestApplications(request); // 客户端的申请都是由经理发起的，但实际上决策是谁，客户端不知道

        Request request2 = new Request();
        request2.setRequestType("请假");
        request2.setRequestContent("不给请假我不干了");
        request2.setNumber(4);
        commonManager.requestApplications(request2);

        Request request3 = new Request();
        request3.setRequestType("加薪");
        request3.setRequestContent("不给加薪我不干了");
        request3.setNumber(500);
        commonManager.requestApplications(request3);

        Request request4 = new Request();
        request4.setRequestType("加薪");
        request4.setRequestContent("不给加薪我不干了");
        request4.setNumber(1000);
        commonManager.requestApplications(request4);
    }
}
