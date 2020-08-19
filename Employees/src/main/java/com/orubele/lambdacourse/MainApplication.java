package com.orubele.lambdacourse;

import java.util.ArrayList;
import java.util.List;

public class MainApplication {
    public static void main(String[] args) {
        final String ANSI_YELLOW = "\u001B[33m";

        Employee john = new Employee("John Doe", 22);
        Employee tim = new Employee("Tim Buchalka", 30);
        Employee jack = new Employee("Jack Bow", 40);
        Employee snow = new Employee("Snow White", 45);

        List<Employee> employees = new ArrayList<>();
        employees.add(john);
        employees.add(tim);
        employees.add(jack);
        employees.add(snow);

        employees.forEach(employee -> {
            System.out.println(employee.getName());
            System.out.println(employee.getAge());
        });

    }
}
