package com.devil.builder.used;

/**
 * 建造人指挥者
 * Created by callmeDevil on 2019/7/21.
 */
public class PersonDirector {

    private PersonBuilder builder;

    public PersonDirector(PersonBuilder builder){
        // 用户告诉指挥者需要什么样的小人
        this.builder = builder;
    }

    // 根据用户的选择建造小人
    public void createPerson(){
        builder.buildHead();
        builder.buildBody();
        builder.buildArmLeft();
        builder.buildArmRight();
        builder.buildLegLeft();
        builder.buildLegRight();
    }

}
