package aplication;

import entities.Company;
import entities.Individual;
import entities.TaxPayer;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        ArrayList<TaxPayer> taxPayers = new ArrayList<>();

        System.out.print("Enter the number of payers: ");
        int quantityPayers = scan.nextInt();

        for (int i = 0; i < quantityPayers; i++) {
            System.out.printf("Tax payer #%d data\n", i+1);
            System.out.print("Individual or company (i/c)? ");
            char type = scan.next().charAt(0);
            scan.nextLine();

            System.out.print("Name: ");
            String payerName = scan.nextLine();

            System.out.print("Anual Income: ");
            double anualIcome = scan.nextDouble();

            if (type == 'i') {
                System.out.print("Health expenditures: ");
                double healtExpenditures = scan.nextDouble();

                taxPayers.add(new Individual(payerName, anualIcome, healtExpenditures));
            }

            if (type == 'c') {
                System.out.print("Number of employees: ");
                int numberOfEmployees = scan.nextInt();

                taxPayers.add(new Company(payerName, anualIcome, numberOfEmployees));
            }
        }

        System.out.println("\nTAXES PAID:");

        double totalTaxes = 0;
        for (TaxPayer taxPayer : taxPayers) {
            System.out.println(taxPayer);
            totalTaxes += taxPayer.tax();
        }

        System.out.printf("\nTOTAL TAXES: $%.2f", totalTaxes);

        scan.close();
    }
}