package Entities;

public class Car {
    private String manufacturer;
    private String color;
    private Integer manufactureYear;
    protected Double speed = 0.0;

    public Car() { }

    public Car(String manufacturer, String color) {
        this.manufacturer = manufacturer;
        this.color = color;
    }

    public Car(String manufacturer, String color, Integer manufactureYear) {
        this.manufacturer = manufacturer;
        this.color = color;
        this.manufactureYear = manufactureYear;
    }

    public void speedUp() {
        speed += 10;
    }

    public void brake() {
        if (speed < 10) {
            speed = 0.0;
        } else {
            speed -= 10;
        }
    }

    public void chageColor(String color) {
        this.color = color;
    }

    public boolean preOwned() {
        if (manufactureYear > 2020) {
            return true;
        }
        return false;
    }
}
