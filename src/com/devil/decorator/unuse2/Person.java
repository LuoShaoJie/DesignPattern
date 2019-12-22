package com.devil.decorator.unuse2;

/**
 * 人类
 * Created by callmeDevil on 2019/6/23.
 */
public class Person {

    private String name;

    public Person(String name){
        this.name = name;
    }

    public void show(){
        System.out.println("装扮的" + name);
    }

}
