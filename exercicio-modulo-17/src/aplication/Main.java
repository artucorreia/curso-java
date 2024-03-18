package aplication;

import entities.Product;

import java.io.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        String path = "C:\\Users\\Arthur\\Documents\\exercicio";
        boolean newFile = new File(path + "\\out").mkdir();
        ArrayList<Product> products = new ArrayList<>();

        try(
            BufferedReader br =
                new BufferedReader(
                    new FileReader(path + "\\products.csv")
                );

            BufferedWriter bw =
                new BufferedWriter(
                    new FileWriter(path + "\\out\\summary.csv")
                );
        ) {
            String line = br.readLine();
            while (line != null) {
                String[] atributes = line.split(",");
                products.add(
                    new Product(
                        atributes[0],
                        Double.parseDouble(atributes[1]),
                        Integer.parseInt(atributes[2])
                    )
                );
                line = br.readLine();
            }

            for (Product product : products) {
                bw.write(String.format("%s,%.2f", product.getName(), product.totalPrice()));
                bw.newLine();
            }
        }
        catch (IOException e) {
            System.out.println("Error " + e.getMessage());
        }
        catch (RuntimeException e) {
            System.out.println("Unexpected Error");
        }
    }
}