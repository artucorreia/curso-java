package Util;

public class Calculator {
    public static final double PI = 3.14159;

    public static double circumference(Double radius) {
        return 2.0 * PI * radius;
    }
    public static double volume(Double radius) {
        return 4.0 * PI * Math.pow(radius, 3) / 3;
    }
}
