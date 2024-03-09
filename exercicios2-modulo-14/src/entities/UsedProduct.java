package entities;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class UsedProduct extends Product{
    private LocalDate manufactureDate;

    public UsedProduct(String name, Double price, LocalDate manufactureDate) {
        super(name, price);
        this.manufactureDate = manufactureDate;
    }

    @Override
    public final String priceTag() {
        return super.getName() +
                "(used) " +
                String.format("$%.2f", super.getPrice()) +
                " (Manufacture date: " +
                manufactureDate.format(
                        DateTimeFormatter.ofPattern("dd/MM/yyyy")
                ) +
                ")";
    }
}