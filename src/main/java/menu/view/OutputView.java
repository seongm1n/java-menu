package menu.view;

import menu.model.Coach;

public class OutputView {

    public static void printStart() {
        System.out.println("점심 메뉴 추천을 시작합니다.");
    }

    public static void printInsertCoach() {
        System.out.println("코치의 이름을 입력해 주세요. (, 로 구분)");
    }

    public static void printInsertNotFood(String name) {
        System.out.println(name + "(이)가 못 먹는 메뉴를 입력해 주세요.");
    }

    public static void printResultIntro() {
        System.out.println("메뉴 추천 결과입니다.\n" +
                "[ 구분 | 월요일 | 화요일 | 수요일 | 목요일 | 금요일 ]");
    }

    public static void printCategory(int[] category) {
        String[] stringCategory = new String[category.length];
        for (int i = 0; i < 5; i++) {
            if (category[i] == 1) stringCategory[i] = "일식";
            if (category[i] == 2) stringCategory[i] = "한식";
            if (category[i] == 3) stringCategory[i] = "중식";
            if (category[i] == 4) stringCategory[i] = "아시안";
            if (category[i] == 5) stringCategory[i] = "양식";
        }
        System.out.print("[ 카테고리 | ");
        for (int i = 0; i < 5; i++) {
            System.out.print(stringCategory[i]);
            if (i != category.length - 1) {
                System.out.print(" | ");
            }
        }
        System.out.println(" ]");
    }

    public static void printMenu(String coach, String[] menus) {
        System.out.print("[ " + coach + " | ");
        for (int i = 0; i < menus.length; i++) {
            System.out.print(menus[i]);
            if (i != menus.length - 1) {
                System.out.print(" | ");
            }
        }
        System.out.println(" ]");
    }
}
