package com.tms.lesson6;

import java.util.Arrays;

public class Director extends Employee {

    Employee[] employee = new Employee[0];

    public Director(String name, String surName, int experience) {
        super(name, surName, POSITION.DIRECTOR, experience);
    }

    @Override
    public void positionInCompany(POSITION position) {
        this.position = position;
    }

    public void addWorker (Employee employee1) {
        employee = Arrays.copyOf(employee, employee.length + 1);
        int i = employee.length - 1;
        employee[i] = employee1;
    }

    @Override
    public int calculateSalary() {
        if (employee.length > 0) {
            return 1000 * position.koef * experience * employee.length;
        } else {
            return 1000 * position.koef * experience;
        }
    }

    @Override
    public String toString() {
        return "Director{" +
                "employee=" + Arrays.toString(employee) +
                ", position=" + position +
                ", experience=" + experience +
                ", salary=" + calculateSalary() +
                ", name='" + name + '\'' +
                ", surName='" + surName + '\'' +
                '}';
    }
}