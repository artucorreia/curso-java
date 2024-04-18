package model.entities;

import model.exceptions.ProductException;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class PerishableProduct extends Product{
    private static final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    private static final LocalDate today = LocalDate.now();
    private LocalDate expirationDate;

    public PerishableProduct(
            String name,
            Double price,
            Double weightKg,
            String composition,
            LocalDate expirationDate
    ) {
        if (expirationDate.isBefore(today)) {
            throw new ProductException("Data de validade deve ser superior a data atual");
        }

        super(name, price, weightKg, composition);
        this.expirationDate = expirationDate;
    }

    public LocalDate getExpirationDate() {
        return expirationDate;
    }

    @Override
    public String toString() {
        return super.toString() +
                "Expiration date: " +
                getExpirationDate().format(formatter) +
                "\n";
    }
}
