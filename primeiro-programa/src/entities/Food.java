package entities;

public class Food {
    private String name;
    private Double price;
    private Integer ranting;

    public Food() {}

    public Food(String name, Double price, Integer ranting) {
        this.name = name;
        this.price = price;
        this.ranting = ranting;
    }

    public String getName() {
        return name;
    }

    public Double getPrice() {
        return price;
    }

    public Integer getRanting() {
        return ranting;
    }
}
