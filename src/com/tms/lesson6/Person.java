package com.tms.lesson6;

public class Person {

    public String name;
    public String surName;

    public Person(String name, String surName) {
        this.name = name;
        this.surName = surName;
    }

    public String nameInfo() {
        return name +  " " + surName;
    }

}
