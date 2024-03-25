package model.entities;

import model.services.Employee;

public class Analyst extends BaseEmployee implements Employee {
    public Analyst(String id, String name, Double baseSalary) {
        super(id, name, baseSalary);
    }

    @Override
    public double calculateSalary() {
        double bonus = 500;
        return getBaseSalary() + bonus;
    }
}
