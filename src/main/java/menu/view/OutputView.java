package menu.view;

public class OutputView {
    private static final String START = "점심 메뉴 추천을 시작합니다.";
    private static final String INSERT_COACH_NAME = "코치의 이름을 입력해 주세요. (, 로 구분)";
    private static final String INSERT_NOT_FOOD = "(이)가 못 먹는 메뉴를 입력해 주세요.";
    private static final String RESULT_INTRO = "메뉴 추천 결과입니다.\n[ 구분 | 월요일 | 화요일 | 수요일 | 목요일 | 금요일 ]";
    private static final String JAPAN_FOOD = "일식";
    private static final String KOREA_FOOD = "한식";
    private static final String CHINA_FOOD = "중식";
    private static final String ASIA_FOOD = "아시안";
    private static final String WEASTEN_FOOD = "양식";
    private static final String CATEGORY_START = "[ 카테고리 | ";
    private static final String STEP = " | ";
    private static final String PRINT_START = "[ ";
    private static final String PRINT_END = " ]";

    public static void printStart() {
        System.out.println(START);
    }

    public static void printInsertCoach() {
        System.out.println(INSERT_COACH_NAME);
    }

    public static void printInsertNotFood(String name) {
        System.out.println(name + INSERT_NOT_FOOD);
    }

    public static void printResultIntro() {
        System.out.println(RESULT_INTRO);
    }

    public static void printCategory(int[] category) {
        String[] stringCategory = new String[category.length];
        for (int i = 0; i < 5; i++) {
            if (category[i] == 1) stringCategory[i] = JAPAN_FOOD;
            if (category[i] == 2) stringCategory[i] = KOREA_FOOD;
            if (category[i] == 3) stringCategory[i] = CHINA_FOOD;
            if (category[i] == 4) stringCategory[i] = ASIA_FOOD;
            if (category[i] == 5) stringCategory[i] = WEASTEN_FOOD;
        }
        System.out.print(CATEGORY_START);
        for (int i = 0; i < 5; i++) {
            System.out.print(stringCategory[i]);
            if (i != category.length - 1) {
                System.out.print(STEP);
            }
        }
        System.out.println(PRINT_END);
    }

    public static void printMenu(String coach, String[] menus) {
        System.out.print(PRINT_START + coach + STEP);
        for (int i = 0; i < menus.length; i++) {
            System.out.print(menus[i]);
            if (i != menus.length - 1) {
                System.out.print(STEP);
            }
        }
        System.out.println(PRINT_END);
    }

    public static void printCoachesNumberError() {
        System.out.println("[ERROR] 코치는 최소 2명, 최대 5명까지입니다.");
    }

    public static void printCoachesNameError() {
        System.out.println("[ERROR] 코치의 이름은 최소 2글자, 최대 4글자입니다.");
    }
}
