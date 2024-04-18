package aplication;

import model.entities.Cart;
import model.entities.NonPerishableProduct;
import model.entities.PerishableProduct;
import model.entities.Product;
import model.exceptions.CartException;
import model.exceptions.ProductException;

import java.time.LocalDate;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        try {
            Cart cart = new Cart();
            cart.insertItem(
                new PerishableProduct(
                    "Milk",
                    5.99,
                    1.0,
                    "Cow milk",
                    LocalDate.of(2024, 6, 30)
                )
            );
            cart.insertItem(
                new PerishableProduct(
                    "Yogurt",
                    3.49,
                    0.5,
                    "Natural yogurt",
                    LocalDate.of(2024, 5, 15)
                )
            );
            cart.insertItem(
                new NonPerishableProduct(
                    "Panela",
                    79.99,
                    1.5,
                    "Aço inoxidável",
                    "Panela antiaderente"
                )
            );


            System.out.printf("R$%.2f", cart.totalCart()); // output: R$89.47

        }
        catch (ProductException e) {
            System.out.println("Product error: " + e.getMessage());
        }
        catch (CartException e) {
            System.out.println("Cart error: " + e.getMessage());
        }
        catch (RuntimeException e) {
            System.out.println("Unexpected error " + e.getMessage());
        }
    }
}