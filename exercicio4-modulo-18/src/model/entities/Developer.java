package model.entities;

import model.services.Employee;

public class Developer extends BaseEmployee implements Employee {
    public Developer(String id, String name, Double baseSalary) {
        super(id, name, baseSalary);
    }

    @Override
    public double calculateSalary() {
        double productivityBonus = 0.1 * getBaseSalary();
        return getBaseSalary() + productivityBonus;
    }
}
