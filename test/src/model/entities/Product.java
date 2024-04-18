package model.entities;

import model.exceptions.ProductException;

public abstract class Product {
    private String name;
    private Double price;
    private Double weightKg;
    private String composition;

    public Product(String name, Double price, Double weightKg, String composition) {
        if (price <= 0) {
            throw new ProductException("O valor do produto deve ser maior que zero");
        }
        if (weightKg <= 0) {
            throw new ProductException("O peso do produto deve ser maior que zero");
        }
        if (name.trim().isEmpty() || composition.trim().isEmpty()) {
            throw new ProductException("Campos nome e composition são obrigatórios");
        }
        if (name == null || price == null || weightKg == null || composition == null) {
            throw new ProductException("Os dados do produto não podem ser nulos");
        }

        this.name = name;
        this.price = price;
        this.weightKg = weightKg;
        this.composition = composition;
    }

    public String getName() {
        return name;
    }

    public Double getPrice() {
        return price;
    }

    public Double getWeightGrams() {
        return weightKg;
    }

    public String getComposition() {
        return composition;
    }

    @Override
    public String toString() {
        StringBuffer sb = new StringBuffer();
        sb.append("Product -\n");
        sb.append("Name: ").append(getName()).append("\n");
        sb.append("Price: ").append(getPrice()).append("\n");
        sb.append("WeightGrams: ").append(getWeightGrams()).append("\n");
        sb.append("Composition: ").append(getComposition()).append("\n");
        return sb.toString();
    }
}
