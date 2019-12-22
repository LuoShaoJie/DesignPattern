package com.devil.builder.unuse;

/**
 * 瘦人类
 * Created by callmeDevil on 2019/7/21.
 */
public class PersonThinBuilder {

    private Person person;

    public PersonThinBuilder(Person person){
        this.person = person;
        System.out.println("瘦人类：");
    }

    // 建造瘦子
    public void build(){
        person.drawHead();
        person.drawBody();
        person.drawHand();
        person.drawLeg();
    }

}
