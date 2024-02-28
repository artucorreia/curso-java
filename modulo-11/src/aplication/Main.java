package aplication;

import entities.Employee;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        ArrayList<Employee> employees = new ArrayList<>();

        System.out.print("How many employees will be registered? ");
        int quantityEmployees = scan.nextInt();

        for (int i = 0; i < quantityEmployees; i++) {
            System.out.printf("\nEmployee #%d\n", i+1);

            System.out.print("Id: ");
            int employeeId = scan.nextInt();
            scan.nextLine();

            System.out.print("Name: ");
            String employeeName = scan.nextLine();

            System.out.print("Salary: ");
            double employeeSalary = scan.nextDouble();

            employees.add(new Employee(employeeId, employeeName, employeeSalary));
        }

        // increase salary
        System.out.print("\nEnter the emplooy id that will have salary increase: ");
        int employeeId = scan.nextInt();
        Employee employeeIncreaseSalary = employees.stream().filter(element -> element.getId() == employeeId).findFirst().orElse(null);

        if (employeeIncreaseSalary == null) {
            System.out.println("This id does not exist!");
        } else {
            System.out.print("Enter the percentage: ");
            double percentageIncrease = scan.nextDouble();
            employeeIncreaseSalary.increaseSalary(percentageIncrease);
        }

        // pular linha
        System.out.println();

        for (Employee employee : employees) {
            System.out.println(employee);
        }

        scan.close();
    }
}