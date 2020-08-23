package com.orubele.lambdacourse;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.function.*;

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

        IntPredicate greaterThan = i -> i > 15;
        IntPredicate lessThan = i -> i < 100;
        System.out.println(greaterThan.test(10));
        System.out.println(greaterThan.and(lessThan).test(50));
        System.out.println("=================================");

        Random random = new Random();
        Supplier<Integer> randomSupplier = () -> random.nextInt(1000);
        for (int i = 0; i < 10; i++) {
            System.out.println(randomSupplier.get());
        }

        System.out.println("==============================");
        // Function One
        Function<Employee, String> employeeLastName = (Employee employee) -> {
            return employee.getName().substring(employee.getName().indexOf(' ') + 1);
        };
        // Function Two.
        Function<Employee, String> employeeFirstName = (Employee employee) -> {
            return employee.getName().substring(0,employee.getName().indexOf(' '));
        };


        System.out.println("=========================");
        employees.forEach(employee -> {
            String lastName = employee.getName().substring(employee.getName().indexOf(' ') + 1);
            System.out.println("Last name is " + lastName);
        });

        Random random1 = new Random();
        for (Employee employee : employees) {
            if (random1.nextBoolean()){
                System.out.println(getAName(employeeLastName, employee));
            }else {
                System.out.println(getAName(employeeFirstName, employee));
            }
        }
        
        Function<Employee, String> upperCase = employee -> employee.getName().toUpperCase();
        Function<String,String> getUpperFirstname = name -> name.substring(0, name.indexOf(' '));
        Function chainedFunction =  upperCase.andThen(getUpperFirstname);
        System.out.println(chainedFunction.apply(employees.get(0)));

        // BiFunction interface that accepts two argument.
        BiFunction<String, Employee, String> concat = (String name, Employee employee) -> {
            return name.concat(" " + employee.getAge());
        };

        String name = upperCase.apply(employees.get(0));
        System.out.println(concat.apply(name, employees.get(0)));

        Predicate<String> name2 =  namez -> namez.equals("John");
        boolean answer = name2.test(employees.get(0).getName());
        System.out.println(answer);

        IntUnaryOperator incBy5 = i -> i + 5;
        System.out.println(incBy5.applyAsInt(20));

    }//main

    private static String getAName(Function<Employee, String> getName, Employee employee){
        return getName.apply(employee);
    }

//            char[] charArray = new char[10];
//            for (int i = 0; i < charArray.length; i++) {
//                char c = charArray[i];
//                System.out.print(c);
//                c = '\u0000';
//                c = Character.MIN_VALUE;
//            }
//        }
//        public static String repeat(int repeat, String string) {
//            return new String(new char[repeat]).replace("\u0000", string);
//        }


    private static void printEmployeeByAge(List<Employee> employees, String ageText, Predicate<Employee> ageCondition) {
        System.out.println(ageText);
        for (Employee employee : employees) {
            if (ageCondition.test(employee)) {
                System.out.println(employee.getName());
            }

        }
    }

}

