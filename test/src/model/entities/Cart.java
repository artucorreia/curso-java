package model.entities;

import model.exceptions.CartException;

import java.util.ArrayList;
import java.util.List;

public class Cart {
    private List<Product> products = new ArrayList<>();

    public Cart() { }

    public void insertItem(Product product) {
        products.add(product);
    }

    public void removeItemForIndex(int i) {
        if (i > products.size()) {
            throw new CartException("Informe um index válido para remoção");
        }
        products.remove(i);
    }

    public List<Product> getProducts() {
        return products;
    }

    public double totalCart() {
        return products.stream().map(Product::getPrice).reduce(0.0, (a, b) -> a + b);
    }
}
