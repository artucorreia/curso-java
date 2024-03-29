package entities;

public class Product implements Comparable<Product> {
    private String name;
    private Double price;

    public Product(String name, Double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public Double getPrice() {
        return price;
    }

    @Override
    public int compareTo(Product other) {
        return getPrice().compareTo(other.getPrice());
    }

    @Override
    public String toString() {
        return getName() + ", R$" + getPrice();
    }
}
