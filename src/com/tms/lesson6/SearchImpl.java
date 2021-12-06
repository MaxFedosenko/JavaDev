package com.tms.lesson6;

public class SearchImpl implements Search {
    @Override
    public void SearchEmp(Director director, String name) {
        for (Employee employee : director.employee) {
            if (employee.name.equals(name)) {
                System.out.println("there's result");
            } else {
                System.out.println("not result");
            }
        }
    }
}
