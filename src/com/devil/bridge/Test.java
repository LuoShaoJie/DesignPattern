package com.devil.bridge;

/**
 * Created by callmeDevil on 2019/12/14.
 */
public class Test {
    public static void main(String[] args) {
        HandsetBrand ab;
        System.out.println("---手机品牌N：");
        ab = new HandsetBrandN();
        ab.setHandsetSort(new HandsetGame());
        ab.run();
        ab.setHandsetSort(new HandsetAddressList());
        ab.run();
        System.out.println("---手机品牌M：");
        ab = new HandsetBrandM();
        ab.setHandsetSort(new HandsetGame());
        ab.run();
        ab.setHandsetSort(new HandsetAddressList());
        ab.run();
    }
}
