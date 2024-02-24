package Entities;

import java.util.Scanner;

public class Product {
    String name;
    double price;
    int quantity;
    Scanner scan = new Scanner(System.in);

    public Product(Rectangle rectangle) { }

    public void getProductData() {
        System.out.println("Enter product data:");
        System.out.print("Name: ");
        name = scan.nextLine();
        System.out.print("Price: ");
        price = scan.nextDouble();
        System.out.print("Quantity: ");
        quantity = scan.nextInt();
    }

    public double totalValueStock() { return quantity * price; }
    public void addProducts(int quantity) { this.quantity += quantity; }
    public void removeProducts(int quantity) { this.quantity -= quantity; }

    public String toString() {
        return "Product data: " +
                name +
                ", $ " +
                String.format("%.2f", price) +
                ", " +
                quantity +
                " units, Total: $" +
                String.format("%.2f", totalValueStock());
    }
}