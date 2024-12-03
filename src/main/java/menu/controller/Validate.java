package menu.controller;

import menu.view.OutputView;

public class Validate {
    public boolean validateCoach(String[] inputCoaches) {
        if (inputCoaches.length > 5 || inputCoaches.length < 2) {
            OutputView.printCoachesNumberError();
            return false;
        }
        for (String inputCoach : inputCoaches) {
            if (inputCoach.length() < 2 || inputCoach.length() > 4) {
                OutputView.printCoachesNameError();
                return false;
            }
        }
        return true;
    }
}
