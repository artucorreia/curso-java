package model.entities;

import model.services.Employee;

public class Manager extends BaseEmployee implements Employee {
    public Manager(String id, String name, Double baseSalary) {
        super(id, name, baseSalary);
    }

    @Override
    public double calculateSalary() {
        double bonus = 1000;
        return getBaseSalary() + bonus;
    }
}