import entities.Product;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        products.add(new Product("TV", new BigDecimal(900)));
        products.add(new Product("Mouse", new BigDecimal(50)));
        products.add(new Product("Tablet", new BigDecimal(350.50)));
        products.add(new Product("HD Case", new BigDecimal(80.90)));
        products.add(new Product("Monitor", new BigDecimal(300)));
        System.out.println("Todos os produtos:");
        System.out.println(products);

        products.forEach(
            p -> p.setPrice(
                p.getPrice().multiply(
                    new BigDecimal(1.1)
                )
            )
        );
        System.out
        System.out.println(products);
    }
}
