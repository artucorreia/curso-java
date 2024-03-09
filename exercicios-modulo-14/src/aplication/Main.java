package aplication;

import entities.Employee;
import entities.OutsourceEmployee;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        ArrayList<Employee> employees = new ArrayList<>();

        System.out.print("Enter the number of employees: ");
        int quantityEmployees = scan.nextInt();

        for (int i = 0; i < quantityEmployees; i++) {
            System.out.printf("Employee #%d data:\n", i+1);

            System.out.print("Outsourced (y/n)? ");
            char outsourced = scan.next().charAt(0);

            System.out.print("Name: ");
            scan.nextLine();
            String name = scan.nextLine();

            System.out.print("Hours: ");
            int hours = scan.nextInt();

            System.out.print("Value per hour: ");
            double valuePerHour = scan.nextDouble();

            if(outsourced == 'y') {
                System.out.print("Additional charge: ");
                double additionalCharge = scan.nextDouble();

                employees.add(new OutsourceEmployee(name, hours, valuePerHour, additionalCharge));
            } else {
                employees.add(new Employee(name, hours, valuePerHour));
            }
        }

        System.out.println();
        System.out.println("PAYMENTS:");
        for (Employee employee: employees) {
            System.out.printf("%s - $ %.2f\n", employee.getName(), employee.payment());
        }

        scan.close();
    }
}