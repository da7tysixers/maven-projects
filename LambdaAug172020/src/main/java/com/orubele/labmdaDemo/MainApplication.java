package com.orubele.labmdaDemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MainApplication {
    public static void main(String[] args) {
        new Thread(()-> {System.out.println("Hello welcome to Lambda");
            System.out.println("welcome yeah");
        }).start();

        Employee john = new Employee("John Doe", 22);
        Employee tim = new Employee("Tim Buchalka", 30);
        Employee jack = new Employee("Jack Bow", 40);
        Employee snow = new Employee("Snow White", 45);

        List<Employee> employees = new ArrayList<>();
        employees.add(john);
        employees.add(tim);
        employees.add(jack);
        employees.add(snow);

        Collections.sort(employees, new Comparator<Employee>(){

            @Override
            public int compare(Employee employee1, Employee employee2) {
                return employee1.getName().compareTo(employee2.getName());
            }
        });

        for (Employee employee : employees) {
            System.out.println(employee.getName());

        }
    }

}


class Employee{
private String name;
private int age;

    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}