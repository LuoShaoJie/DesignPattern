package com.devil.decorator.used;

/**
 * 究极进化人类（ConcreteComponent）
 * Created by callmeDevil on 2019/6/23.
 */
public class Person {

    private String name;

    public Person(){}

    public Person(String name){
        this.name = name;
    }

    public void show(){
        System.out.println("装扮的" + name);
    }

}
