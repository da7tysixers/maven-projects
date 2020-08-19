package com.orubele.labmdaDemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
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

//        for (Employee employee : employees) {
//            System.out.println(employee.getName());
//            System.out.println(employee.getAge());
//            new Thread(() -> System.out.println(employee.getAge())).start();
//        }
//        System.out.println("=============================");
//        for (int i = 0; i < employees.size(); i++) {
//            Employee employee = employees.get(i);
//            System.out.println(employee.getName());
//            new Thread(() -> System.out.println(employee.getAge())).start();
//        }
    }// main


    public final static String doStringStuff(UpperConcat upperConcat, String s1, String s2) {
        return upperConcat.upperAndConcat(s1, s2);

    }
}//main class

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

interface UpperConcat{
    String upperAndConcat(String s1, String s2);
}



class AnotherClass {
    public String doSomeThing() {

        UpperConcat uc = (s1, s2) -> {
            System.out.println("The lambda expression's class is: " + getClass().getSimpleName());
            String result = s1.toUpperCase() + s2.toUpperCase();
        return  result;
        };
        System.out.println("The AnotherClass's name is: " + getClass().getSimpleName());
        return MainApplication.doStringStuff(uc, "String1", "String2");

    }

    public void printValue(){
        int number = 25;
        Runnable runnable = () -> {
            try {
                Thread.sleep(1000);
            }catch (InterruptedException e){
                System.out.println("Interrupted");
            }
            System.out.println("The value is " + number);
        };
        new Thread(runnable).start();
    }
}

