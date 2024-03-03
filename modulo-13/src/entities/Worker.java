package entities;

import entities.enums.WorkLevel;

import java.util.ArrayList;

public class Worker {
    private String name;
    private WorkLevel level;
    private Double baseSalary;
    private Department department;
    private ArrayList<HourContract> contracts = new ArrayList<>();
    public Worker(
            Department department,
            String name,
            WorkLevel level,
            Double baseSalary
    ) {
        this.department = department;
        this.name = name;
        this.level = level;
        this.baseSalary = baseSalary;
    }

    public String getName() {
        return name;
    }

    public Department getDepartment() {
        return department;
    }

    public void addContract(HourContract contract) {
        contracts.add(contract);
    }

    public void removeContract(HourContract contract) {
        contracts.remove(contract);
    }

    public double income(Integer year, Integer month) {
        double sum = baseSalary;
        for (HourContract contract: contracts) {
            if (
                contract.getDate().getYear() == year &&
                contract.getDate().getMonth().getValue() == month
            ) {
                sum += contract.totalValue();
            }
        }
        return sum;
    }

    @Override
    public String toString() {
        return "Worker{" +
                "name='" + name + '\'' +
                ", level=" + level +
                ", baseSalary=" + baseSalary +
                ", department=" + department +
                ", contracts=" + contracts +
                '}';
    }
}
