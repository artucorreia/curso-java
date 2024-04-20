package model.services;

import model.entities.Employee;

import java.util.List;
import java.util.stream.Stream;

public class EmployeeService {
    public static List<String> filterEmailsBySalary(List<Employee> employees, double salary) {
        return employees.stream()
                .filter(p -> p.getSalary() > salary)
                .map(Employee::getEmail)
                .sorted()
                .toList();
    }

    public static double filteredSumByInitialName(List<Employee> employees, char letter) {
        return employees.stream()
                .filter(p -> p.getName()
                .charAt(0) == letter)
                .map(Employee::getSalary)
                .reduce(0.0, (a, b) -> a + b);
    }
}
