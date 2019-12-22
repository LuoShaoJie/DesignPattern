package com.devil.abstractFactory.unuse;

/**
 * Created by callmeDevil on 2019/7/28.
 */
public class Test {

    public static void main(String[] args) {
        User user = new User();
        SqlServerUser su = new SqlServerUser();
        su.insert(user);
        su.getUser(user.getId());
    }

}
