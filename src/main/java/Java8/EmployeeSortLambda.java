package Java8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EmployeeSortLambda {

    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Alice", 3));
        employees.add(new Employee("Bob", 1));
        employees.add(new Employee("Charlie", 2));

        Collections.sort(employees, (e1, e2) -> e1.getName().compareTo(e2.getName()));

        System.out.println("Sorted employees by name: " + employees);
    }
}
