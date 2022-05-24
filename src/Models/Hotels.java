package Models;

import java.util.ArrayList;
import java.util.List;

public class Hotels {
    List<Food> FoodItems = null;
    public Hotels() {
        FoodItems = new ArrayList<>();
    }
    public void addFood(Food food) {
        this.FoodItems.add(food);
    }
    public List<Food> getFoodItems() {
        return this.FoodItems;
    }
    public boolean isFoodAvaliable(String name) {
        for(Food food : FoodItems) {
            if(food.getName().equals(name)) return true;
        }
        return false;
    }
}
