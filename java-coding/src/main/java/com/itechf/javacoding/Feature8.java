package com.itechf.javacoding;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

import org.springframework.stereotype.Component;

@Component
public class Feature8 {

    private List<Integer> intList = List.of(1, 3, 5, 6, 12, 3, 10);

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
            new Employee(1, "Amit", "Golu", 10000, EmployeeType.CONSULTANT),
            new Employee(2, "Deepak", "Golu", 15000, EmployeeType.FULL_TIME),
            new Employee(3, "Sumit", "Golu", 17000, EmployeeType.FULL_TIME),
            new Employee(4, "Abdul", "Golu", 11000, EmployeeType.PART_TIME),
            new Employee(5, "Ram", "Golu", 11500, EmployeeType.FULL_TIME)
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
        
        System.out.println("Max No in List");
        Employee a = empList.stream().max((o1, o2) -> o1.getId() - o2.getId()).get();
        System.out.println(a);

        Optional<Integer> mVal =  intList.stream().max((l1, l2) -> l1 - l2);
        System.out.println(mVal.get());

        Map<Integer, Long> countGroup = intList.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(countGroup);
    }
}
