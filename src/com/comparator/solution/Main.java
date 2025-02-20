package com.comparator.solution;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Employee> employeeList = Arrays.asList(
                new Employee("Prateek", 10000.0),
                null,
                new Employee("Harman", 9000.0),
                new Employee("Ram", 80000.0),
                null
        );


        //sorting based no salary if salaries are same then by name
        employeeList.sort(Comparator.comparingDouble((Employee e)->e.salary).thenComparing(e->e.name));
        System.out.println(employeeList);


        //sorting by salary and shift null to end
        employeeList.sort(
                Comparator.nullsLast(Comparator.comparingDouble((Employee e) ->
                        e.salary
                ).reversed())
        );
        System.out.println(employeeList);

        /* Sort a list of Student objects based on the following rules:
        Sort by grade (higher is better).
        If grades are equal, sort by name alphabetically.
        If names are also equal, sort by age (younger first).*/

        List<Student> students = Arrays.asList(new Student("Prateek", 90, 20),
                new Student("Harman", 80, 21),
                new Student("Shivam", 90, 22),
                new Student("Rishi", 85, 20)
        );
        students.sort(Comparator.comparingInt((Student s) -> s.grade).reversed().thenComparing(s -> s.name).thenComparingInt(s -> s.age));
        System.out.println(students);

        /*You need to sort a HashMap<String, Integer> by its values in ascending order and
        return the result as a LinkedHashMap to maintain the sorted order.
        }*/
        Map<String, Integer> productPrices = new HashMap<>();
        productPrices.put("Laptop", 80000);
        productPrices.put("Phone", 50000);
        productPrices.put("Tablet", 30000);
        productPrices.put("Monitor", 20000);

        // Sort the map by values in ascending order and return a LinkedHashMap
        Map<String, Integer> sortedMap = productPrices.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue()) // Sort by values
                .collect(Collectors.toMap(
                        Map.Entry::getKey,                 // Key mapper
                        Map.Entry::getValue,               // Value mapper
                        (e1, e2) -> e1,                    // Merge function (handles duplicate keys)
                        LinkedHashMap::new                 // Collect into LinkedHashMap
                ));

        // Print the sorted map
        System.out.println("Sorted Map by Values: " + sortedMap);

    }

}