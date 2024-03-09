package aplication;

import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        ArrayList<Product> products = new ArrayList<>();

        System.out.print("Enter the number of products: ");
        int quantityProducts = scan.nextInt();
        for (int i = 0; i < quantityProducts; i++) {
            System.out.printf("Product #%d data:\n", i+1);
            System.out.print("common, used or imported (c/u/i)? ");
            char productType = scan.next().charAt(0);
            scan.nextLine();

            System.out.print("Name: ");
            String productName = scan.nextLine();
            System.out.print("Price: ");
            double productPrice = scan.nextDouble();

            if (productType == 'c') {
                products.add(new Product(productName, productPrice));
            }

            if (productType == 'u') {
                System.out.print("Manufacture date (DD/MM/YYYY): ");
                String manufactureProduct = scan.next();

                DateTimeFormatter formatter =
                        DateTimeFormatter.ofPattern("dd/MM/yyyy");

                products.add(
                        new UsedProduct(
                                productName,
                                productPrice,
                                LocalDate.parse(manufactureProduct, formatter)
                        )
                );
            }

            if (productType == 'i') {
                System.out.print("Customs fee: ");
                double customsFee = scan.nextDouble();

                products.add(new ImportedProduct(productName, productPrice, customsFee));
            }
        }

        System.out.println("\nPRICE TAGS:");
        for (Product product : products) {
            System.out.println(product.priceTag());
        }

        scan.close();
    }
}