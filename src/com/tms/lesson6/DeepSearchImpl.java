package com.tms.lesson6;
import java.util.Objects;

public class DeepSearchImpl implements Search {
    @Override
    public void SearchEmp(Director director, String name) {
        for (Employee employee : director.employee) {
            if (Objects.equals(employee.name, name)) {
                System.out.println("there's result");
            } else if (Objects.equals(employee.position, POSITION.DIRECTOR)) {
                SearchEmp((Director)employee, name);
            } else {
                System.out.println("not result");
            }
        }
    }
}
