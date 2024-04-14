import entities.Product;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>() {
            {
                add(new Product("TV", 900d));
                add(new Product("Mouse", 50d));
                add(new Product("Tablet", 350d));
                add(new Product("HD Case", 81d));
                add(new Product("Monitor", 300d));
            }
        };

        // Lista com os nomes do produtos
        List<String> productsNames = products.stream().map(p -> p.getName().toUpperCase()).toList();
        System.out.println(products);
        System.out.println(productsNames);
    }
}
