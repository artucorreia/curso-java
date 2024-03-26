package entities;

import java.util.ArrayList;

public class Restaurant {
    private ArrayList<Food> menu = new ArrayList<>();

    public Restaurant(){ }

    public void addItemToMenu(Food food) {
        menu.add(food);
    }

    public void removeItemToMenu(String item) {
        Food food = searchFoodForName(item);
        if (food == null) {
            throw new IllegalArgumentException("Item não está no menu");
        }
        menu.remove(food);
    }

    public Food searchFoodForName(String item) {
        for (Food food : menu) {
            if (food.getName().equals(item)) {return food;}
        }
        return null;
    }

    public double averageRating() {
        double totalRating = 0;
        for (Food food : menu) {
            totalRating += food.getRanting();
        }
        return totalRating / menu.size();
    }
}
