package com.devil.interpretor;

/**
 * Created by callmeDevil on 2019/12/15.
 */
public class Test {
    public static void main(String[] args) {
        PlayContext context = new PlayContext();
        // 音乐-上海滩
        System.out.println("上海滩：");
        // 增加速度的设置
        context.setText("T 500 O 2 E 0.5 A 3 E 0.5 G 0.5 D 3 E 0.5 G 0.5 A 0.5 O 3 C 1 O 2 A 0.5 G 1 C 0.5 E 0.5 D 3 ");
        Expression expression = null;
        try {
            while (context.getText().length() > 0) {
                String string = context.getText().substring(0, 1);
                switch (string) {
                    case "O": // 当首字母是O时，表达式实例化为音阶
                        expression = new Scale();
                        break;
                    case "T": // 增加对T的判断
                        expression = new Speed();
                        break;
                    case "C":
                    case "D":
                    case "E":
                    case "F":
                    case "G":
                    case "A":
                    case "B":
                    case "P": // 当首字母是CDEFGAB以及休止符P时，则实例化为音符
                        expression = new Note();
                        break;
                }
                expression.interpret(context);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
