package com.tms.lesson6;

public class Worker extends Employee {
    public Worker(String name, String surName, int experience) {
        super(name, surName, POSITION.WORKER, experience);
    }

    @Override
    public void positionInCompany(POSITION position) {
        this.position = position;
    }

    @Override
    public String toString() {
        return "Worker{" +
                "position=" + position +
                ", experience=" + experience +
                ", salary=" + calculateSalary() +
                ", name='" + name + '\'' +
                ", surName='" + surName + '\'' +
                '}';
    }
}
