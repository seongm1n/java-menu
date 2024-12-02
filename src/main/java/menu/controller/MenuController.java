package menu.controller;

import menu.model.Coach;
import menu.view.InputView;
import menu.view.OutputView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MenuController {
    List<Coach> coaches = new ArrayList<>();
    public void run() {
        OutputView.printStart();
        setCoaches();
    }

    private void setCoaches() {
        OutputView.printInsertCoach();
        String[] inputCoaches = InputView.insertCoach().split(",");
        for (String inputCoach : inputCoaches) {
            Coach coach = new Coach(inputCoach);
            OutputView.printInsertNotFood(coach.getName());
            String[] NotFood = InputView.insertNotFood().split(",");
            Arrays.stream(NotFood).forEach(coach::addNotFood);
            coaches.add(coach);
        }
    }
}
