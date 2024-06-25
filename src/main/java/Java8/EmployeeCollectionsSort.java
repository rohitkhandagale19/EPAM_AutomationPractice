package Java8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class EmployeeCollectionsSort {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Alice", 1));
        employees.add(new Employee("Bob", 2));
        employees.add(new Employee("Charlie", 3));

        Collections.sort(employees, new Comparator<Employee>() {
            @Override
            public int compare(Employee e1, Employee e2) {
                return e2.getName().compareTo(e1.getName());
            }
        });

        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }
}
