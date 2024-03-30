import entities.Product;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        /*
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);
        services.PrintService<String> ps = new services.PrintService<>();

        System.out.print("How much values? ");
        int n = scan.nextInt();

        for (int i = 0; i < n; i++) {
            ps.addValue(scan.next());
        }

        ps.print();
        System.out.println("First: " + ps.first());

        scan.close();
        */

        // wildcard types

        /*
        List<Shape> shapes = new ArrayList<>();
        shapes.add(new Circle(2.0));
        shapes.add(new Rectangle(3.0, 2.0));
        System.out.println("List Shapes: " + sumAreas(shapes));

        List<Circle> circles = new ArrayList<>();
        circles.add(new Circle(2.0));
        circles.add(new Circle(4.0));

        System.out.println("List Circles: " + sumAreas(circles));

        List<Rectangle> rectangles = new ArrayList<>();
        rectangles.add(new Rectangle(2.0, 10.0));
        rectangles.add(new Rectangle(4.0, 6.0));

        System.out.println("List Rectangles: " + sumAreas(rectangles));
        */

        /*
        List<Integer> integers = new ArrayList<>(List.of(1, 2, 3, 4));
        List<Double> doubles = new ArrayList<>(List.of(3.14, 6.28));
        List<Object> objects = new ArrayList<>();

        System.out.println("Integers: " + integers);
        System.out.println("Doubles: " + doubles);
        System.out.println("Objects: " + objects);
        copy(integers, objects);
        System.out.println("Objects: " + objects);
        copy(doubles, objects);
        System.out.println("Objects: " + objects);
        */

        /*
        List<Integer> integers = new ArrayList<>(List.of(5, 10));
        List<Double> doubles = new ArrayList<>(List.of(2.5, 3.14));
        List<String> strings = new ArrayList<>(List.of("Arthur", "João"));

        Double number = 13.2;
        List<Object> objects = new ArrayList<>(List.of("Flávio", number));

        printList(integers); // output: [5, 10]
        printList(doubles); // output: [2.5, 3.14]
        printList(strings); // output: ["Arthur", João]
        printList(objects); // output: ["Flávio", 13.2]

         */

        // metodos de comparação
        /*
        Client a = new Client("Arthur", "arthur@gmail.com");
        Client b = new Client("Arthur", "lais@gmail.com");
        System.out.println(a.hashCode());
        System.out.println(b.hashCode());
        System.out.println(a.equals(b));
        System.out.println(a == b);
         */

        Set<Integer> a = new TreeSet<>(List.of(0, 2, 4, 5, 6, 8, 10));
        Set<Integer> b = new TreeSet<>(List.of(5, 6, 7, 8, 9, 10));

        // union
        Set<Integer> union = new TreeSet<>(a);
        union.addAll(b);
        System.out.println(union);

        // intersection
        Set<Integer> intersection = new TreeSet<>(a);
        intersection.retainAll(b);
        System.out.println(intersection);

        // difference
        Set<Integer> difference = new TreeSet<>(a);
        difference.removeAll(b);
        System.out.println(difference);

    }

    /*
    public static double sumAreas(List<? extends Shape> list) {
        double sumAreas = 0;
        for (Shape shape : list) {
            sumAreas += shape.area();
        }
        return sumAreas;
    }

    public static void copy(List<? extends Number> source, List<? super Number> destiny) {
        for (Number number : source) {
            destiny.add(number);
        }
    }

    public static void printList(List<?> list) {
        for (Object item : list) {
            System.out.println(item);
        }
    }

     */
}