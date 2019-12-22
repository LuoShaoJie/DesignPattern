package com.devil.builder.used;

import com.devil.builder.unuse.Person;

/**
 * Created by callmeDevil on 2019/7/21.
 */
public class Test {

    public static void main(String[] args) {
        Person person = new Person();
        PersonDirector thinDirector = new PersonDirector(new PersonThinBuilder(person));
        thinDirector.createPerson();

        System.out.println();
        PersonDirector fatDirector = new PersonDirector(new PersonFatBuilder(person));
        fatDirector.createPerson();
    }

}
