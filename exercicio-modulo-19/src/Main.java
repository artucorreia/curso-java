import entities.Product;
import services.CalculationService;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        String path = "C:\\Users\\Arthur\\Documents\\alt.txt";
        List<Product> products = new ArrayList<>();

        try (
            BufferedReader br = new BufferedReader(new FileReader(path))
        ) {
            String line = br.readLine();
            while (line != null) {
                String name = line.split(",")[0];
                Double price = Double.parseDouble(line.split(",")[1]);
                products.add(new Product(name, price));
                line = br.readLine();
            }
            System.out.println(CalculationService.max(products));
        }
        catch (IOException e) {
            System.out.println("error " + e.getMessage());
        }

    }
}