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

        System.out.print("Entre com o preço por hora: ");
        double pricePerHour = scan.nextDouble();
        System.out.print("Entre com o preço por hora: ");
        double pricePerDay = scan.nextDouble();

        RentalService rentalService = new RentalService(
                pricePerHour,
                pricePerDay,
                new BrazilTaxService()
        );

        rentalService.processInvoice(carRental);
        System.out.println();
        System.out.println("FATURA:\n" + carRental);

        scan.close();
    }
}