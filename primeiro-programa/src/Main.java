import entities.Food;
import entities.Restaurant;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Restaurant restaurant = new Restaurant();
        restaurant.addItemToMenu(new Food("Hamburger", 5.99, 4));
        restaurant.addItemToMenu(new Food("Pizza", 8.50, 5));
        restaurant.addItemToMenu(new Food("Salad", 6.25, 3));
        restaurant.addItemToMenu(new Food("Pasta", 10.75, 4));
        restaurant.addItemToMenu(new Food("Steak", 15.99, 5));

        System.out.println(restaurant.averageRating());
    }
}