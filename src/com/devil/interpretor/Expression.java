package com.devil.interpretor;

/**
 * 表达式类
 * Created by callmeDevil on 2019/12/15.
 */
public abstract class Expression {

    // 解释器
    public void interpret(PlayContext context){
        if (context.getText().length() == 0) {
            return;
        } else {
            // 此方法用于将当前演奏文本第一条命令获得命令字母和其参数值
            // 例如：“O 3 E 0.5 G 0.5 A 3”，则 playKey 为O，而playValue 为3
            String playKey = context.getText().substring(0, 1);
            context.setText(context.getText().substring(2));
            double playValue = Double.parseDouble(context.getText().substring(0, context.getText().indexOf(" ")));
            // 获得playKey 和 playValue 后将其从演奏文本中移除
            // 例如：“O 3 E 0.5 G 0.5 A 3”变成了“E 0.5 G 0.5 A 3”
            context.setText(context.getText().substring(context.getText().indexOf(" ") + 1));

            excute(playKey, playValue);
        }
    }

    // 抽象方法执行，不同的文法的子类，有不同的执行处理
    public abstract void excute(String key ,double value);

}
