package com.devil.builder.used;

import com.devil.builder.unuse.Person;

/**
 * 建造人抽象类
 * Created by callmeDevil on 2019/7/21.
 */
public abstract class PersonBuilder {

    protected Person person;

    public PersonBuilder(Person person){
        this.person = person;
    }

    public abstract void buildHead();
    public abstract void buildBody();
    public abstract void buildArmLeft();
    public abstract void buildArmRight();
    public abstract void buildLegLeft();
    public abstract void buildLegRight();

}
