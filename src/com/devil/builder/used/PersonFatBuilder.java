package com.devil.builder.used;

import com.devil.builder.unuse.Person;

/**
 * 胖人类2
 * Created by callmeDevil on 2019/7/21.
 */
public class PersonFatBuilder extends PersonBuilder{

    public PersonFatBuilder(Person person){
        super(person);
        System.out.println("胖人类2：");
    }

    @Override
    public void buildHead() {
        System.out.print("头 ");
    }

    @Override
    public void buildBody() {
        System.out.print("身体 ");
    }

    @Override
    public void buildArmLeft() {
        System.out.print("左手 ");
    }

    @Override
    public void buildArmRight() {
        System.out.print("右手 ");
    }

    @Override
    public void buildLegLeft() {
        System.out.print("左脚 ");
    }

    @Override
    public void buildLegRight() {
        System.out.print("右脚 ");
    }

}
