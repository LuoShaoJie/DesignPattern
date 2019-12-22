package com.devil.adapter.used;

import com.devil.adapter.unuse.Player;

/**
 * 翻译者
 * Created by callmeDevil on 2019/8/4.
 */
public class Translator extends Player{

    // 声明并实例化一个内部“外籍中锋”对象，表明翻译者与外籍球员有关联
    private ForeignCenter wjzf = new ForeignCenter();

    public Translator(String name){
        super(name);
        wjzf.setName(name);
    }

    @Override
    public void attack() {
        // 翻译者将“attack”翻译为“进攻”告诉外籍中锋
        wjzf.进攻();
    }

    @Override
    public void defense() {
        // 翻译者将“defense”翻译为“防守”告诉外籍中锋
        wjzf.防守();
    }

}
