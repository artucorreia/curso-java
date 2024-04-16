package services;

import entities.Product;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class ProductService {
    public double filteredSum(List<Product> products, Predicate<Product> condition) {
        double sum = 0.0;
        for (Product product : products) {
            if (condition.test(product)) {
                sum += product.getPrice();
            }
        }
        return sum;
    }

    public void doublePrice(List<Product> products, Consumer<Product> function) {
        for (Product product : products) {
            function.accept(product);
        }
    }
}
