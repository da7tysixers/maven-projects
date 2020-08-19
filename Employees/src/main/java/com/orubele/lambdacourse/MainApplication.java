package com.orubele.lambdacourse;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class MainApplication {
    public static void main(String[] args) {
        final String ANSI_YELLOW = "\u001B[33m";

        Employee john = new Employee("John Doe", 22);
        Employee tim = new Employee("Tim Buchalka", 30);
        Employee jack = new Employee("Jack Bow", 40);
        Employee snow = new Employee("Snow White", 45);
        Employee red = new Employee("Red Flint", 22);
        Employee charming = new Employee("Prince Charming", 30);

        List<Employee> employees = new ArrayList<>();
        employees.add(john);
        employees.add(tim);
        employees.add(jack);
        employees.add(snow);
        employees.add(red);
        employees.add(charming);


        System.out.println("++++++++++++++++++++");

        printEmployeeByAge(employees, "Age greater than 30 ", employee -> employee.getAge() > 30);
        System.out.println("=================================");
        printEmployeeByAge(employees, "Age less than 30 ", employee -> employee.getAge() <= 30);
        printEmployeeByAge(employees, "\nEmployees younger than 25", new Predicate<Employee>() {
            @Override
            public boolean test(Employee employee) {
               return employee.getAge() < 25;
            }
        });


    }

    private static void printEmployeeByAge(List<Employee> employees, String ageText, Predicate<Employee> ageCondition) {
        System.out.println(ageText);
        for (Employee employee : employees) {
            if (ageCondition.test(employee)) {
                System.out.println(employee.getName());
            }

        }
    }

}

