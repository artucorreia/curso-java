package service;

import entities.CarRental;
import entities.Invoice;

import java.time.Duration;
import java.time.temporal.ChronoUnit;

public class RentalService {
    private Double pricePerHour;
    private Double pricePerDay;
    private TaxService taxService;

    public RentalService(Double pricePerHour, Double pricePerDay, TaxService taxService) {
        this.pricePerHour = pricePerHour;
        this.pricePerDay = pricePerDay;
        this.taxService = taxService;
    }

    public void processInvoice(CarRental carRental) {
        double hours =
            (double) Duration.between(carRental.getStart(), carRental.getFinish()).toMinutes()/60;

        double basicPayment;

        if (hours <= 12) {
            basicPayment = pricePerHour *  Math.ceil(hours);
        } else {
            basicPayment = pricePerDay * Math.ceil(hours/24.0);
        }

        carRental.setInvoice(
            new Invoice(
                basicPayment,
                taxService.tax(basicPayment)
            )
        );
    }
}
