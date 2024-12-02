package menu.view;

import camp.nextstep.edu.missionutils.Console;

public class InputView {

    public static String insertCoach() {
        return input();
    }

    public static String insertNotFood() {
        return input();
    }

    private static String input() {
        return Console.readLine();
    }
}
