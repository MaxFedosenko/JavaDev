package com.tms.lesson4;

public class UserInfo {
    public static void main(String[] args) {
        USERENUM userenum = USERENUM.NAME;
        User user = new User();
        System.out.println(user.agePlus(user.age));
        System.out.println(user.Info());
    }
}
