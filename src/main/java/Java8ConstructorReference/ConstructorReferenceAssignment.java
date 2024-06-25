package Java8ConstructorReference;

public class ConstructorReferenceAssignment {
    public static void main(String[] args) {
        // Using constructor reference to create an Employee object
        TriFunction<String, String, Double, Employee> employeeConstructor = Employee::new;

        // Creating an Employee object
        Employee employee = employeeConstructor.apply("Rohit Khandagale", "12345", 75000.00);

        // Getting the details of the Employee object
        System.out.println("Employee Name: " + employee.getName());
        System.out.println("Employee Account: " + employee.getAccount());
        System.out.println("Employee Salary: " + employee.getSalary());
    }
}
// Functional interface to handle three parameters
@FunctionalInterface
interface TriFunction<T, U, V, R> {
    R apply(T t, U u, V v);
}
