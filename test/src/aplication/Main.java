package aplication;

import Entities.Car;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Car> cars = new ArrayList<>();

        cars.add(new Car("Ford", "Azul", 2022));
        cars.add(new Car("Ferrari", "Vermelha", 2019));

        System.out.println("Carro da Ford é seminovo? " + cars.get(0).preOwned()); // true
        System.out.println("Carro da Ferrari é seminovo? " + cars.get(1).preOwned()); // false
    }
}