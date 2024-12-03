package menu.controller;

import camp.nextstep.edu.missionutils.Randoms;
import menu.model.Coach;
import menu.model.MenuRepository;
import menu.view.InputView;
import menu.view.OutputView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class MenuController {
    List<Coach> coaches = new ArrayList<>();
    MenuRepository menuRepository = new MenuRepository();
    int[] category;

    public void run() {
        OutputView.printStart();
        setCoaches();
        OutputView.printResultIntro();
        setCategory();
        OutputView.printCategory(category);
        coaches.forEach(this::menuRecommendations);
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

    private void setCategory() {
        category = new int[5];
        IntStream.range(0, 5).forEach(i -> category[i] = Randoms.pickNumberInRange(1, 5));
    }

    private void menuRecommendations(Coach coach) {
        String[] menus = new String[5];
        for (int i = 0; i < 5; i++) {
            menus[i] = selectMenu(i, coach);
        }
        OutputView.printMenu(coach.getName(), menus);
    }

    private String selectMenu(int index, Coach coach) {
        String menu = menuRepository.getMenu(category[index]);
        if (!coach.checkMenu(menu)) {
            return selectMenu(index, coach);
        }
        return menu;
    }
}
