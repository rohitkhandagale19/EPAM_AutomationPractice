package Java8ConstructorReference;

class Employee {
    private String name;
    private String account;
    private double salary;

    public Employee(String name, String account, double salary) {
        this.name = name;
        this.account = account;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public String getAccount() {
        return account;
    }

    public double getSalary() {
        return salary;
    }
}
