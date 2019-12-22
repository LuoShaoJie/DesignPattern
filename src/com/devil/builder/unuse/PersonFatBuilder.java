package com.devil.builder.unuse;

/**
 * 胖人类
 * Created by callmeDevil on 2019/7/21.
 */
public class PersonFatBuilder {

    private Person person;

    public PersonFatBuilder(Person person){
        this.person = person;
        System.out.println("胖人类：");
    }

    // 建造胖子
    public void build(){
        person.drawHead();
        person.drawBody();
        person.drawHand();
        person.drawLeg();
    }

}
