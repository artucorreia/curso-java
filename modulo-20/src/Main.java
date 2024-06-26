import entities.Product;
import services.ProductService;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
//        List<Product> products = new ArrayList<>() {
//            {
//                add(new Product("TV", 900d));
//                add(new Product("Mouse", 50d));
//                add(new Product("Tablet", 350d));
//                add(new Product("HD Case", 81d));
//                add(new Product("Monitor", 300d));
//            }
//        };
//
//        ProductService ps = new ProductService();
//        System.out.println(ps.filteredSum(products, p -> p.getPrice() > 100.0)); // output: 1550.0
//        System.out.println(ps.filteredSum(products, p -> p.getName().startsWith("T"))); // output: 1250.0
//
//        ps.doublePrice(products, p -> p.setPrice(p.getPrice() * 2)); // dobrar o valor dos produtos

        List<Integer> list = new ArrayList<>() {{
            add(1);
            add(2);
            add(3);
            add(4);
            add(5);
        }};

        Stream<Integer> str1 = list.stream();
        System.out.println(Arrays.toString(str1.toArray())); // output: [1, 2, 3, 4, 5]

        List<Double> str2 = list.stream().map(n -> Math.pow(n, 2)).toList();
        System.out.println(str2); // output: [1.0, 4.0, 9.0, 16.0, 25.0]

        List<Integer> str3 = list.stream().filter(x -> x%2==0).map(x -> x*10).toList();
        System.out.println(str3); // output: [20, 40]
    }
}