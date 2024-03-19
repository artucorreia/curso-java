package aplication;

import entities.CarRental;
import entities.Vehicle;
import service.BrazilTaxService;
import service.RentalService;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        System.out.println("Entre com os dados do aluguel");
        System.out.print("Modelo do carro: ");
        String carModel = scan.next();
        scan.nextLine();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        System.out.print("Retirada (dd/MM/yyyy hh:mm): ");
        LocalDateTime start =  LocalDateTime.parse(scan.nextLine(), formatter);
        System.out.print("Retorno (dd/MM/yyyy hh:mm): ");
        LocalDateTime finish =  LocalDateTime.parse(scan.nextLine(), formatter);

        CarRental carRental = new CarRental(
                new Vehicle(carModel),
                start,
                finish
        );


        RentalService rentalService = new RentalService(
                10.0,
                130.0,
                new BrazilTaxService()
        );

        System.out.println(rentalService.processInvoice(carRental));
        scan.close();
    }
}