package Entities;

import Entities.enums.Color;

public class Rectangle extends Shape{

    Double width;
    Double height;

    public Rectangle() { }

    public Rectangle(Color color, Double width, Double height) {
        super(color);
        this.width = width;
        this.height = height;
    }

    @Override
    public final double area() {
        return width * height;
    }
}
