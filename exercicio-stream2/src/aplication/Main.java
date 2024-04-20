package aplication;

import model.entities.Employee;
import model.entities.EmployeeManager;
import model.services.EmployeeService;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter full file path: ");
        String path = scan.next();

        EmployeeManager manager = new EmployeeManager();

        try (BufferedReader br = new BufferedReader(new FileReader(path))){
            String line = br.readLine();
            while (line != null) {
                String[] data = line.split(",");
                manager.addEmployee(
                    new Employee(
                        data[0],
                        data[1],
                        Double.parseDouble(data[2])
                    )
                );
                line = br.readLine();
            }

            System.out.print("Enter salary: ");
            double salary = scan.nextDouble();

            List<String> emails = EmployeeService.filterEmailsBySalary(manager.getEmployees(), salary);
            System.out.printf("Email of people whose salary is more than R$%.2f:\n", salary);
            emails.forEach(System.out::println);

            System.out.print("Enter with a letter: ");
            char letter = Character.toUpperCase(scan.next().charAt(0));
            double filteredSum = EmployeeService.filteredSumByInitialName(manager.getEmployees(), letter);
            System.out.printf("Sum of salary of people whose name starts with '%s': R$%.2f", letter, filteredSum);
        }
        catch (IOException e) {
            System.out.println(e.getMessage());
        }

        scan.close();
    }
}