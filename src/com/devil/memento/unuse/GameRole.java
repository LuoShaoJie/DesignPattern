package com.devil.memento.unuse;

/**
 * 游戏角色
 * Created by callmeDevil on 2019/8/11.
 */
public class GameRole {

    // 生命力
    private int vit;
    // 攻击力
    private int atk;
    // 防御力
    private int def;

    // 状态显示
    public void stateDisplay() {
        System.out.println("角色当前状态：");
        System.out.println(String.format("体力：%s", this.vit));
        System.out.println(String.format("攻击力：%s", this.atk));
        System.out.println(String.format("防御力：%s", this.def));
        System.out.println();
    }

    //  获得初始状态
    public void getInitState() {
        // 数据通常来自本机磁盘或远程数据库
        this.vit = 100;
        this.atk = 100;
        this.def = 100;
    }

    // 战斗
    public void fight(){
        // 在与Boss大战后游戏数据损耗为0
        this.vit = 0;
        this.atk = 0;
        this.def = 0;
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
