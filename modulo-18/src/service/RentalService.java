package service;

import entities.CarRental;
import entities.Invoice;

import java.time.temporal.ChronoUnit;

public class RentalService {
    private Double pricePerHour;
    private Double pricePerDay;
    private BrazilTaxService taxService;

    public RentalService(Double pricePerHour, Double pricePerDay, BrazilTaxService taxService) {
        this.pricePerHour = pricePerHour;
        this.pricePerDay = pricePerDay;
        this.taxService = taxService;
    }

    public void processInvoice(CarRental carRental) {
        long minutes = ChronoUnit.MINUTES.between(carRental.getStart(), carRental.getFinish());
        double days = (double) minutes/1440;
        double hours = (double) minutes/60;

        if (days < 0) {
            if( hours - ((int) hours) > 0) {
                hours += 1;
            }
            double basicPayment = pricePerHour * (int) hours;
            double tax = taxService.tax(pricePerHour * (int) hours);
            carRental.setInvoice(new Invoice(basicPayment, tax));
        } else {
            if( days - ((int) days) > 0) {
                days += 1;
            }
            double basicPayment = pricePerHour * (int) days;
            double tax = taxService.tax(pricePerHour * (int) days);
            carRental.setInvoice(new Invoice(basicPayment, tax));
        }

    }
}
