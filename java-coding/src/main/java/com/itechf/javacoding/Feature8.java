package com.itechf.javacoding;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.stereotype.Component;

@Component
public class Feature8 {

    private List<Integer> intList = List.of(1, 3, 5, 6, 12, 10);

    public void print() {
        // intList.forEach(System.out::println);
        patternDemo();
    }

    public void patternDemo() {
        int k = 1;
        for (int i = 0; i <= 4; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(k++ + " ");
            }
            System.out.println();
        }
    }

    public void printOddNumber() {
        List<Integer> intList = List.of(1, 2, 3, 5, 6, 12, 10, 11);
        intList.stream().filter(i -> i % 2 == 1).forEach(System.out::println);
    }

    public void employeeSalaryGraterThan(Integer maxSal) {

        List<Employee> empList = List.of(
            new Employee(1, "Amit", 10000),
            new Employee(2, "Deepak", 15000),
            new Employee(3, "Sumit", 17000),
            new Employee(4, "Abdul", 11000),
            new Employee(5, "Ram", 11500)
            );
        
        empList.stream().filter(emp -> emp.getSalary() > maxSal).forEach(System.out::println);
        List<String> empNameList = empList.stream().filter(emp -> emp.getSalary() > maxSal).map(emp -> emp.getName()).toList();
        List<String> empNameList2 = empList.stream().filter(emp -> emp.getSalary() > maxSal).map(emp -> emp.getName()).collect(Collectors.toList());
        System.err.println(empNameList);
        System.err.println(empNameList2);
        Map<Integer, String> empMap = empList.stream().filter(emp -> emp.getSalary() > maxSal).collect(Collectors.toMap(Employee::getId, Employee::getName));
        Map<Integer, String> empMap2 = empList.stream().filter(emp -> emp.getSalary() > maxSal).collect(Collectors.toMap(e -> e.getId(), e -> e.getName()));
        System.err.println(empMap);
        System.err.println(empMap2);
        Map<Integer, String> empAsMap = empList.stream().collect(Collectors.toMap(e -> e.getId(), e -> e.getName()));
        empAsMap.forEach((k, v) -> System.out.println(k + " | " + v));
    }
}
