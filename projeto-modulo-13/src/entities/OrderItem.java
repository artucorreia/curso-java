package entities;

public class OrderItem {
    private Integer quantity;
    private Double price;

    private Product product;

    public OrderItem(Product product, int quantity) {
        this.product = product;
        this.quantity = quantity;
        this.price = subTotal();
    }

    public Double subTotal() {
        return product.getPrice() * quantity;
    }

    @Override
    public String toString() {
        return product.getName() +
                ", " +
                String.format("$%.2f", product.getPrice()) +
                ", Quantity: " +
                quantity +
                ", " +
                "Subtotal: " +
                String.format("$%.2f", price);
    }
}

