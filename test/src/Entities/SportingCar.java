package Entities;

public class SportingCar extends Car{
    private Boolean sportMode = false;

    public SportingCar() { }

    public SportingCar(String manufacturer, String color) {
        super(manufacturer, color);
    }

    public SportingCar(String manufacturer, String color, Integer manufactureYear) {
        super(manufacturer, color, manufactureYear);
    }

    public void activateSportMode() {
        sportMode = true;
        speed += 100;
    }
}
