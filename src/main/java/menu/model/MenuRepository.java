package menu.model;

import camp.nextstep.edu.missionutils.Randoms;

import java.util.Arrays;
import java.util.List;

public class MenuRepository {
    private final List<String> japan =
            Arrays.asList("규동", "우동", "미소시루", "스시", "가츠동", "오니기리", "하이라이스", "라멘", "오코노미야끼");
    private final List<String> korea =
            Arrays.asList("김밥", "김치찌개", "쌈밥", "된장찌개", "비빔밥", "칼국수", "불고기", "떡볶이", "제육볶음");
    private final List<String> china =
            Arrays.asList("깐풍기", "볶음면", "동파육", "짜장면", "짬뽕", "마파두부", "탕수육", "토마토 달걀볶음", "고추잡채");
    private final List<String> asia =
            Arrays.asList("팟타이", "카오 팟", "나시고렝", "파인애플 볶음밥", "쌀국수", "똠얌꿍", "반미", "월남쌈", "분짜");
    private final List<String> western =
            Arrays.asList("라자냐", "그라탱", "뇨끼", "끼슈", "프렌치 토스트", "바게트", "스파게티", "피자", "파니니");

    public String getMenu(int category) {
        if (category == 1) return Randoms.shuffle(japan).get(0);
        if (category == 2) return Randoms.shuffle(korea).get(0);
        if (category == 3) return Randoms.shuffle(china).get(0);
        if (category == 4) return Randoms.shuffle(asia).get(0);
        if (category == 5) return Randoms.shuffle(western).get(0);
        return null;
    }
}
