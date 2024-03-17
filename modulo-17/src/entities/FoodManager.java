package entities;

import java.util.ArrayList;

public class FoodManager {
    private ArrayList<Food> foods = new ArrayList<>();

    public FoodManager() { }

    public void addNewFood(String foodName) {
        foods.add(new Food(foodName));
    }
    public void getFoods() {
        for (Food food : foods) {
            System.out.println(food);
        }
    }
}
