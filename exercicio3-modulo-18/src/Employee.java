public class Employee implements Comparable<Employee>{
    private String name;
    private Double salary;

    public Employee(String name, Double salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public Double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return getName() + ", " + getSalary();
    }

    @Override
    public int compareTo(Employee employee) {
        return employee.getSalary().compareTo(getSalary());
    }
}
