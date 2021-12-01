package com.tms.lesson6;

public abstract class Employee extends Person {

    public POSITION position;
    public int experience;

    public Employee(String name, String surName, POSITION position, int experience) {
        super(name, surName);
        this.position = position;
        this.experience = experience;
    }

    public int calculateSalary() {
        return 1000 * position.koef * experience;
    }

    public abstract void positionInCompany(POSITION position);
}
