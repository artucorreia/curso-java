package model.entities;

import java.util.ArrayList;
import java.util.List;

public class EmployeeManager {
    private List<Employee> employees = new ArrayList<>();

    public EmployeeManager() { }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    public Employee getEmployeeForIndex(int index) {
        return employees.get(index);
    }

    public void removeEmployeeForIndex(int index) {
        employees.remove(index);
    }
}
