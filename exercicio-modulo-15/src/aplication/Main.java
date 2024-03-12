package aplication;

import model.entities.Reservation;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Reservation reservation;

        try {
            System.out.print("Room number: ");
            int room = scan.nextInt();
            System.out.print("Check-out date (dd/MM/yyyy): ");
            String checkIn = scan.next();
            System.out.print("Check-out date (dd/MM/yyyy): ");
            String checkOut = scan.next();

            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

            reservation = new Reservation(
                    room,
                    LocalDate.parse(checkIn, formatter),
                    LocalDate.parse(checkOut, formatter)
            );
        }
        catch (InputMismatchException e) {
            System.out.println("Input error");
        }

        scan.close();
    }
}