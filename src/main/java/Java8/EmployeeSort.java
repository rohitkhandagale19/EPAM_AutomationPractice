package Java8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class EmployeeSort {

    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Alice", 3));
        employees.add(new Employee("Bob", 1));
        employees.add(new Employee("Charlie", 2));

        Comparator<Employee> nameComparator = new Comparator<Employee>() {
            @Override
            public int compare(Employee e1, Employee e2) {
                return e1.getName().compareTo(e2.getName());
            }
        };

        Collections.sort(employees, nameComparator);

        System.out.println("Sorted employees by name: " + employees);
    }
}
