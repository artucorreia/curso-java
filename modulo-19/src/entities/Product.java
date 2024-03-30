package entities;

public class Product implements Comparable<Product>{
    private String name;
    private Double price;

    public Product(String name, Double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Override
    public int compareTo(Product other) {
        return other.getPrice().compareTo(getPrice());
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Product{");
        sb.append("name: ").append(name);
        sb.append(", price: ").append(price);
        sb.append('}');
        return sb.toString();
    }
}
