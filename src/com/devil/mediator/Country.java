package com.devil.mediator;

/**
 * 国家（相当于Colleague类）
 * Created by callmeDevil on 2019/12/15.
 */
public abstract class Country {

    protected UnitedNations mediator;

    public Country(UnitedNations mediator){
        this.mediator = mediator;
    }

}
