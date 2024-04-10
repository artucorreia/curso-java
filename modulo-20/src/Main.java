import entities.Product;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        products.add(new Product("TV", 1600d));
        products.add(new Product("Notebook", 2830.78));
        products.add(new Product("Tablet", 1800.50));
        Comparator<Product> productComparator = (p1, p2) -> (p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase()));
        products.sort(productComparator);
    }
}
