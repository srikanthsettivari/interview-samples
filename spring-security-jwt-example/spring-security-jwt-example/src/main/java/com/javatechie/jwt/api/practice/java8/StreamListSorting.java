package com.javatechie.jwt.api.practice.java8;

import com.javatechie.jwt.api.practice.Employee;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamListSorting {
    public static void main(String[] args) {

        // sort employee by salary in ascending order
        List <Employee> employees = new ArrayList< Employee >();
        employees.add(new Employee(10, "Ramesh", 30, 400000));
        employees.add(new Employee(20, "John", 29, 350000));
        employees.add(new Employee(30, "Tom", 30, 450000));
        employees.add(new Employee(40, "Pramod", 29, 500000));

      /*  List < Employee > employeesSortedList1 = employees.stream()
            .sorted((o1, o2) -> (int)(o1.getSalary() - o2.getSalary())).collect(Collectors.toList());
        System.out.println(employeesSortedList1);*/

         employees.stream()
            .sorted(Comparator.comparingLong(Employee::getSalary))
                    .forEach(System.out::println);
         System.out.println("-------------------------------------------------");

        employees.stream()
                .sorted(Comparator.comparingLong(Employee::getAge)
                        .thenComparing(Employee::getId))
                .forEach(System.out::println);






    }
}
