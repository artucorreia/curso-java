package aplication;

import entities.Rent;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        Rent[] rents = new Rent[10];

        System.out.print("How many rooms will be rented? ");
        int quantityStudents = scan.nextInt();


        for (int i = 0; i < quantityStudents; i++) {
            System.out.printf("\nRent #%d\n", i+1);

            System.out.print("Name: ");
            scan.nextLine();
            String name = scan.nextLine();

            System.out.print("Email: ");
            String email = scan.next();

            System.out.print("Room: ");
            scan.nextLine();
            int room = scan.nextInt();
            rents[room] = new Rent(name, email);
        }

        System.out.println("\nBusy rooms:");
        for (int i = 0; i < rents.length; i++) {
            if (rents[i] != null) {
                System.out.printf("%d: ", i);
                System.out.println(rents[i]);
            }
        }

        scan.close();
    }
}