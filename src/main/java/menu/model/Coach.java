package menu.model;

import java.util.ArrayList;
import java.util.List;

public class Coach {
    private String name;
    private List<String> notFood = new ArrayList<>();

    public Coach(String name) {
        this.name = name;
    }

    public void addNotFood(String food) {
        notFood.add(food);
    }

    public String getName() {
        return name;
    }
}
