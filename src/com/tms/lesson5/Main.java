package com.tms.lesson5;

public class Main {
    public static void main(String[] args) {
        Employee worker1 = new Worker("Harry", "Potter", 1);
        Employee worker2 = new Worker("Tony", "Stark", 2);
        Employee worker3 = new Worker("Dean", "Winchester", 3);
        Director director1 = new Director("Sylvester", "Stallone", 4);

        System.out.println(worker1.nameInfo() + " " + worker1.calculateSalary());
        System.out.println(worker2.nameInfo() + " " + worker2.calculateSalary());
        System.out.println(worker3.nameInfo() + " " + worker3.calculateSalary());
        System.out.println(director1.nameInfo() + " " + director1.calculateSalary());
        director1.addWorker(worker1);
        director1.addWorker(worker2);
        System.out.println(director1.nameInfo() + " " + director1.calculateSalary());
        Director director2 = new Director("Jonny", "Funt", 5);
        director1.addWorker(director2);
        director2.addWorker(worker3);
        System.out.println(director2);
        System.out.println(director1);
    }



}
