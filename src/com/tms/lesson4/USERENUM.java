package com.tms.lesson4;

public enum USERENUM {
    NAME("Max Fedosenko"),
    AGE(26),
    ISMAN(true);

    public String name;
    public int age;
    public boolean isMan;


    USERENUM(String name) {
        this.name = name;
    }

    USERENUM(int age) {
        this.age = age;
    }

    USERENUM(boolean isMan) {
        this.isMan = isMan;
    }
}
