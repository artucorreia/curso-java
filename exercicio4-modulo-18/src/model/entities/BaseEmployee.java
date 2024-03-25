package model.entities;

import model.services.Employee;

public abstract class BaseEmployee implements Employee {
    private String id;
    private String name;
    private Double baseSalary;

    public BaseEmployee(String id, String name, Double baseSalary) {
        this.id = id;
        this.name = name;
        this.baseSalary = baseSalary;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Double getBaseSalary() {
        return baseSalary;
    }

    @Override
    public String getDetails() {
        return "Employee " +
                getName() +
                ", Salary: " +
                calculateSalary() +
                ", Position: " +
                getClass().getName();
    }
}
