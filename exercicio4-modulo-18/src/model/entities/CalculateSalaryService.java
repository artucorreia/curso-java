package model.entities;

import model.services.Employee;

public class CalculateSalaryService {
    public double calculateSalary(Employee employee) {
        return employee.calculateSalary();
    }
}
