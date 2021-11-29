package com.tms.lesson4;

public class Constructor {
    public String name;
    public int age;
    public boolean bool;

    Constructor(String name, int age) {
        this.name = name;
        this.age = age;
    }

    Constructor(String name, int age, boolean bool) {
        this(name, age);
        this.bool = bool;
    }
    @Deprecated
    public void consrtuct () {
        System.out.println("name is " + name);
        System.out.println("age is " + age);
        System.out.println("bool is " + bool);
    }
}
