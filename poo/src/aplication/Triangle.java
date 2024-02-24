package aplication;

import java.util.Scanner;

public class Triangle {
    public double a;
    public double b;
    public double c;

    private Scanner scan = new Scanner(System.in);

    public void getMeasures() {
        System.out.print("Informe o lado A:");
        a = scan.nextDouble();
        System.out.print("\nInforme o lado B:");
        b = scan.nextDouble();
        System.out.print("\nInforme o lado C:");
        c = scan.nextDouble();
        return;
    }
    public double area() {
        double p = (a + b + c) / 2;
        return Math.sqrt(p * ( (p - a)*(p - b)*(p - c) ));
    }
}
