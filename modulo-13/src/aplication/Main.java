package aplication;

import entities.Department;
import entities.HourContract;
import entities.Worker;
import entities.enums.WorkLevel;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter departament's name: ");
        String departmentName = scan.next();
        scan.nextLine();

        System.out.println("Enter worker data: ");

        System.out.print("Name: ");
        String workerName = scan.nextLine();

        System.out.print("Level: ");
        String workerLevel = scan.next();

        System.out.print("Base salary: ");
        double baseSalary = scan.nextDouble();

        Worker worker =
                new Worker(
                        new Department(departmentName),
                        workerName,
                        WorkLevel.valueOf(workerLevel),
                        baseSalary
                );

        System.out.print("How Many contracts to this worker? ");
        int quantityContracts = scan.nextInt();

        for (int i = 0; i < quantityContracts; i++) {
            System.out.printf("Enter contract #%d data\n", i+1);

            System.out.print("Date (DD/MM/YYYY): ");
            String date = scan.next();

            System.out.print("Value per hour: ");
            double valuePerHour = scan.nextDouble();

            System.out.print("Duration (hours): ");
            int duration = scan.nextInt();

            HourContract hourContract =
                new HourContract(
                    LocalDate.parse(
                        date,
                        DateTimeFormatter.ofPattern("dd/MM/yyyy")
                    ),
                    valuePerHour,
                    duration);

            worker.addContract(hourContract);
        }

        System.out.println();

        System.out.print("Enter month and year to calculate income (MM/YYYY): ");
        String monthAndYear = scan.next();
        int month = Integer.parseInt(monthAndYear.substring(0, 2));
        int year = Integer.parseInt(monthAndYear.substring(3, 7));

        System.out.println("Name: " + worker.getName());
        System.out.println("Department: " + worker.getDepartment());
        System.out.printf("Income for %s: %.2f", monthAndYear, worker.income(year, month));
        System.out.println(worker);

        scan.close();
    }
}