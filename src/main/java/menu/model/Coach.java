package menu.model;

import java.util.ArrayList;
import java.util.List;

public class Coach {
    private String name;
    private List<String> notFood = new ArrayList<>();
    private List<String> foods = new ArrayList<>();

    public Coach(String name) {
        this.name = name;
    }

    public void addNotFood(String food) {
        notFood.add(food);
    }

    public String getName() {
        return name;
    }

    public boolean checkMenu(String menu) {
        if (foods.contains(menu)) return false;
        if (notFood.contains(menu)) return false;
        foods.add(menu);
        return true;
    }
}
