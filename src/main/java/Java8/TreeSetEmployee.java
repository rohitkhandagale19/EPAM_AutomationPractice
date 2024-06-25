package Java8;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetEmployee {
    public static void main(String[] args) {
        TreeSet<Employee> employees = new TreeSet<>(new Comparator<Employee>() {
            @Override
            public int compare(Employee e1, Employee e2) {
                return e1.getName().compareTo(e2.getName());
            }
        });

        employees.add(new Employee("Alice", 5));
        employees.add(new Employee("Bob", 2));
        employees.add(new Employee("Charlie", 3));

        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }
}
