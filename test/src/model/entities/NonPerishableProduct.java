package model.entities;

import model.exceptions.ProductException;

public class NonPerishableProduct extends Product{
    private String description;

    public NonPerishableProduct(
            String name,
            Double price,
            Double weightKg,
            String composition,
            String description
    ) {
        if (description == null || description.trim().isEmpty()) {
            throw new ProductException("A descrição do produto não pode ser vazia");
        }
        super(name, price, weightKg, composition);
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return super.toString() +
                "Description: " +
                getDescription() +
                "\n";
    }
}
