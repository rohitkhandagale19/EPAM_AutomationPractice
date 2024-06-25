package Java8;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EmployeeCollectionsSortLambda {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Alice", 1));
        employees.add(new Employee("Bob", 2));
        employees.add(new Employee("Charlie", 3));

        Collections.sort(employees, (e1, e2) -> e2.getName().compareTo(e1.getName()));

        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }
}
