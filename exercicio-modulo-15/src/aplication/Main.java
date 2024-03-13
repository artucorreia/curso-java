package aplication;

import model.entities.Reservation;
import model.exceptions.DomainException;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        try {
            System.out.print("Room number: ");
            int room = scan.nextInt();

            System.out.print("Check-out date (dd/MM/yyyy): ");
            LocalDate checkIn = LocalDate.parse(scan.next(), formatter);

            System.out.print("Check-out date (dd/MM/yyyy): ");
            LocalDate checkOut = LocalDate.parse(scan.next(), formatter);

            Reservation reservation = new Reservation(room, checkIn, checkOut);
            System.out.println(reservation);

            System.out.println();

            System.out.println("Enter dates for update the reservation: ");

            System.out.print("Check-out date (dd/MM/yyyy): ");
            LocalDate newCheckIn = LocalDate.parse(scan.next(), formatter);

            System.out.print("Check-out date (dd/MM/yyyy): ");
            LocalDate newCheckOut = LocalDate.parse(scan.next(), formatter);
            reservation.updateDates(newCheckIn, newCheckOut);
            System.out.println(reservation);
        }
        catch (DateTimeParseException e) {
            System.out.println("Error date time: " + e.getMessage());
        }
        catch (InputMismatchException e) {
            System.out.println("Error input: " + e.getMessage());
        }
        catch (DomainException e) {
            System.out.println("Error reservation: " + e.getMessage());
        }
        catch (RuntimeException e) {
            System.out.println("Unexpected error");
        }

        scan.close();
    }
}