package Java8;

import java.util.Comparator;
import java.util.TreeMap;

public class TreeMapEmployee {
    public static void main(String[] args) {
        TreeMap<Employee, String> employeeMap = new TreeMap<>(new Comparator<Employee>() {
            @Override
            public int compare(Employee e1, Employee e2) {
                return e2.getName().compareTo(e1.getName());
            }
        });

        employeeMap.put(new Employee("Alice", 1), "Developer");
        employeeMap.put(new Employee("Bob", 2), "Manager");
        employeeMap.put(new Employee("Charlie", 3), "Analyst");

        for (Employee employee : employeeMap.keySet()) {
            System.out.println(employee + " -> " + employeeMap.get(employee));
        }
    }
}
