package com.devil.interpretor;

/**
 * 音符类
 * Created by callmeDevil on 2019/12/15.
 */
public class Note extends Expression {
    @Override
    public void excute(String key, double value) {
        String note = "";
        switch (key) {
            case "C":
                note = "1"; // 如果获得的 key 是C，则演奏1(do)，是D则演奏2(Re)，以此类推
                break;
            case "D":
                note = "2";
                break;
            case "E":
                note = "3";
                break;
            case "F":
                note = "4";
                break;
            case "G":
                note = "5";
                break;
            case "A":
                note = "6";
                break;
            case "B":
                note = "7";
                break;
        }
        System.out.print(note + " ");
    }
}
