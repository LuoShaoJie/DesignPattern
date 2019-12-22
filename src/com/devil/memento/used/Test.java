package com.devil.memento.used;

/**
 * Created by callmeDevil on 2019/8/11.
 */
public class Test {
    public static void main(String[] args) {
        // 大战Boss前
        GameRole lufi = new GameRole();
        lufi.getInitState();
        lufi.stateDisplay();
        // 保存游戏进度
        RoleStateCaretaker stateAdmin = new RoleStateCaretaker();
        stateAdmin.setMemento(lufi.saveState());// 将具体数据封装在了 Memento中
        // 大战Boss时，损耗严重
        lufi.fight();
        lufi.stateDisplay();
        // 恢复状态
        lufi.recoveryState(stateAdmin.getMemento());
        lufi.stateDisplay();
    }
}
