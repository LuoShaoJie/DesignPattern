package com.devil.memento.used;

/**
 * 角色状态存储类
 * Created by callmeDevil on 2019/8/11.
 */
public class RoleStateMemento {

    // 生命力
    private int vit;
    // 攻击力
    private int atk;
    // 防御力
    private int def;

    // 将生命力、攻击力、防御力存入状态存储箱对象中
    public RoleStateMemento(int vit, int atk, int def){
        this.vit = vit;
        this.atk = atk;
        this.def = def;
    }

    public int getVit() {
        return vit;
    }

    public void setVit(int vit) {
        this.vit = vit;
    }

    public int getAtk() {
        return atk;
    }

    public void setAtk(int atk) {
        this.atk = atk;
    }

    public int getDef() {
        return def;
    }

    public void setDef(int def) {
        this.def = def;
    }

}
