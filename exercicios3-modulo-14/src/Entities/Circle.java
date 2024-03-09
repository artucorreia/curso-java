package Entities;

import Entities.enums.Color;

public class Circle extends Shape{

    Double radius;

    public Circle() { }

    public Circle(Color color, Double radius) {
        super(color);
        this.radius = radius;
    }

    public final double area() {
        return Math.PI * Math.pow(radius, 2);
    }
}
