package com.orubele.labmdaDemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MainApplication {
    public static void main(String[] args) {
        final String ANSI_YELLOW = "\u001B[33m";
        new Thread(() -> {
            System.out.println("Hello welcome to Lambda");
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

//        Collections.sort(employees, new Comparator<Employee>(){
//
//            @Override
//            public int compare(Employee employee1, Employee employee2) {
//                return employee1.getName().compareTo(employee2.getName());
//            }
//        });

//        Collections.sort(employees, (Employee employee1, Employee employee2) ->
//                employee1.getName().compareTo(employee2.getName()));
//
//        for (Employee employee : employees) {
//            System.out.println(employee.getName());
//
//        }
//        String sillyString = doStringStuff(new UpperConcat() {
//            @Override
//            public String upperAndConcat(String s1, String s2) {
//                return s1.toUpperCase() + s2.toUpperCase();
//            }
//        }, employees.get(0).getName(), employees.get(1).getName());
//        System.out.println(sillyString);

//        UpperConcat uc = (s1, s2) -> {
//            String result =ANSI_YELLOW + s1.toUpperCase() +"\n" + s2.toUpperCase();
//        return result;};
//        String sillyString = doStringStuff(uc, employees.get(2).getName(), employees.get(3).getName());
//        System.out.println(sillyString);
        AnotherClass anotherClass = new AnotherClass();
        String s = anotherClass.doSomeThing();
        System.out.println(s);
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
//        System.out.println("The AnotherClass name is: " + getClass().getSimpleName());
//        return MainApplication.doStringStuff(new UpperConcat() {
//            @Override
//            public String upperAndConcat(String s1, String s2) {
//                System.out.println("The Anonymous class name is: " + getClass().getSimpleName());
//                return s1.toUpperCase() + s2.toUpperCase();
//            }
//        }, "String1 ", "String2");
    }
}

