package aplication;

import model.entities.Product;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        List<Product> products = new ArrayList<>();

        System.out.print("Enter full file path: ");
        String path = scan.next();

        try(
            BufferedReader br = new BufferedReader(
                new FileReader(path)
            )
        ) {
            String line = br.readLine();
            while (line != null) {
                String[] data = line.split(",");
                products.add(
                    new Product(
                        data[0],
                        Double.parseDouble(data[1])
                    )
                );
                line = br.readLine();
            }
            double averagePrice = products.stream()
                .map(Product::getPrice)
                .reduce(0.0, (a, b) -> a + b) / products.size();
            System.out.printf("Average price: %.2f\n", averagePrice);

            List<String> cheapProducts =
                products.stream()
                .filter(p -> p.getPrice() < averagePrice)
                .map(Product::getName)
                .sorted(Comparator.reverseOrder())
                .toList();

            cheapProducts.forEach(System.out::println);
        }
        catch (IOException e) {
            System.out.println(e.getMessage());
        }
        catch (RuntimeException e) {
            System.out.println("Unexpected error " + e.getMessage());
        }

        scan.close();
    }
}