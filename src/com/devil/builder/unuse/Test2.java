package com.devil.builder.unuse;

/**
 * Created by callmeDevil on 2019/7/21.
 */
public class Test2 {

    public static void main(String[] args) {
        Person person = new Person();

        PersonThinBuilder thin = new PersonThinBuilder(person);
        thin.build();

        System.out.println();
        PersonFatBuilder fat = new PersonFatBuilder(person);
        fat.build();
    }

}
