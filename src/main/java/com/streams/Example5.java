package com.streams;

import com.streams.Employee;

import java.util.Arrays;
import java.util.List;
import java.util.stream.*;
/*
stream from list
 */
public class Example5 {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("sri","sai", "ohm","van","poo","mah");
        names.stream()
                .map(String::toUpperCase)
                .filter(x -> x.startsWith("S"))
                .peek(System.out::println)
                .collect(Collectors.toList());
       // System.out.println();

        Employee employee = new Employee();

        employee.setId(1);
        employee.setName("First Name");

        Employee emp2 = new Employee();

        emp2.setId(1);
        emp2.setName("sECON Name");

        List<Employee> employeeList = Stream.of(employee, emp2).collect(Collectors.toList());

        List<String> namesOnly = employeeList.stream()
                .map(Employee::getName)
                .collect(Collectors.toList());

        List<Integer> intList = Stream.of(1, 4, 5, 7, 1).collect(Collectors.toList());

        intList.stream()
                .distinct()
                .mapToInt(i -> i)
                .peek(System.out::println)
                .sorted()
                .skip(2)
                .peek(x -> System.out.println("print after skpi : "+x));
                //.collect(Collectors.toSet());
    }
}
