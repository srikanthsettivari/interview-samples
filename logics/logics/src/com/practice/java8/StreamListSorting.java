package com.practice.java8;

import com.practice.Employee;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class StreamListSorting {
    public static void main(String[] args) {

        // sort employee by salary in ascending order
        List <com.practice.Employee> employees = new ArrayList<com.practice.Employee>();
        employees.add(new com.practice.Employee(10, "Ramesh", 30, 400000));
        employees.add(new com.practice.Employee(20, "John", 29, 350000));
        employees.add(new com.practice.Employee(30, "Tom", 30, 450000));
        employees.add(new com.practice.Employee(40, "Pramod", 29, 500000));

      /*  List < Employee > employeesSortedList1 = employees.stream()
            .sorted((o1, o2) -> (int)(o1.getSalary() - o2.getSalary())).collect(Collectors.toList());
        System.out.println(employeesSortedList1);*/

         employees.stream()
            .sorted(Comparator.comparingLong(com.practice.Employee::getSalary))
                    .forEach(System.out::println);
         System.out.println("-------------------------------------------------");

        employees.stream()
                .sorted(Comparator.comparingLong(com.practice.Employee::getAge)
                        .thenComparing(Employee::getId))
                .forEach(System.out::println);






    }
}
