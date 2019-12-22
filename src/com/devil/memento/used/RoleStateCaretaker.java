package com.devil.memento.used;

/**
 * 游戏状态管理者
 * Created by callmeDevil on 2019/8/11.
 */
public class RoleStateCaretaker {

    private RoleStateMemento memento;

    public RoleStateMemento getMemento() {
        return memento;
    }

    public void setMemento(RoleStateMemento memento) {
        this.memento = memento;
    }

}
