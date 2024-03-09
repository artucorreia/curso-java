package aplication;

import Entities.Circle;
import Entities.Rectangle;
import Entities.Shape;
import Entities.enums.Color;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        ArrayList<Shape> shapes = new ArrayList<>();

        System.out.print("Enter the number of shapes: ");
        int quantity = scan.nextInt();

        for (int i = 0; i < quantity; i++) {
            System.out.printf("Shape #%d data\n", i+1);

            System.out.print("Rectangle or Circle (r/c)? ");
            char type = scan.next().charAt(0);

            System.out.print("Color (BLACK, BLUE, RED): ");
            Color color = Color.valueOf(scan.next());

            if (type == 'r') {
                System.out.print("Width: ");
                double width = scan.nextDouble();

                System.out.print("Height: ");
                double height = scan.nextDouble();

                shapes.add(
                        new Rectangle(
                                color,
                                width,
                                height
                        )
                );
            } else {
                System.out.print("Radius: ");
                double radius = scan.nextDouble();

                shapes.add(
                        new Circle(
                                color,
                                radius
                        )
                );
            }
        }

        System.out.println("\nSHAPES AREAS:");
        for (Shape shape : shapes) {
            System.out.printf("%.2f\n",shape.area());
        }

        scan.close();
    }
}