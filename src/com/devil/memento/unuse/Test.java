package com.devil.memento.unuse;

/**
 * Created by callmeDevil on 2019/8/11.
 */
public class Test {
    public static void main(String[] args) {
        // 大战Boss前
        GameRole lufi = new GameRole();
        // 获得初始角色状态
        lufi.getInitState();
        lufi.stateDisplay();
        // 通过“游戏角色”新实例，保存进度
        GameRole backup = new GameRole();
        backup.setVit(lufi.getVit());
        backup.setAtk(lufi.getAtk());
        backup.setDef(lufi.getDef());
        // 大战Boss时，损耗严重，全部为0
        lufi.fight();
        lufi.stateDisplay();
        // GameOver不甘心，恢复进度，重新玩过
        lufi.setVit(backup.getVit());
        lufi.setAtk(backup.getAtk());
        lufi.setDef(backup.getDef());
        lufi.stateDisplay();
    }
}
