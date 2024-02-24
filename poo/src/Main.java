import aplication.Triangle;

import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Triangle triangleOne = new Triangle();
        System.out.println("Enter the measures of triangle X");
        triangleOne.getMeasures();

        Triangle triangleTwo = new Triangle();
        System.out.println("Enter the measures of triangle Y");
        triangleTwo.getMeasures();

        double areaOne = triangleOne.area();
        double areaTwo = triangleTwo.area();

        System.out.printf("Triangle area: %.4f\n", areaOne);
        System.out.printf("Triangle area: %.4f\n", areaTwo);

        if(areaOne > areaTwo) {
            System.out.println("Larger area: X");
        } else if (areaOne < areaTwo) {
            System.out.println("Larger area: Y");
        } else {
            System.out.println("Same area");
        }
    }
}