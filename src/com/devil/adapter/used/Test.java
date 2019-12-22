package com.devil.adapter.used;

import com.devil.adapter.unuse.Forwards;
import com.devil.adapter.unuse.Guards;
import com.devil.adapter.unuse.Player;

/**
 * Created by callmeDevil on 2019/8/4.
 */
public class Test {
    public static void main(String[] args) {
        Player b = new Forwards("巴蒂尔");
        b.attack();
        Player m = new Guards("麦克格雷迪");
        m.attack();

        Player ym = new Translator("姚明");
        // 翻译者告诉姚明，教练要求你既要“进攻”又要“防守”
        ym.attack();
        ym.defense();
    }
}
