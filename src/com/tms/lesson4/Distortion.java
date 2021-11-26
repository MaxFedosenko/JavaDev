package com.tms.lesson4;

public class Distortion {
    public String name;
    public int age;

    public Distortion(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void validate(String name) {
        System.out.println(name);
    }

    public void validate(int age) {
        System.out.println(age);
    }
}
