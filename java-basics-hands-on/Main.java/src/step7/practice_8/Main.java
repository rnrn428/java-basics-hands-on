package step7.practice_8;

enum Category {
    WORK("업무"),
    STUDY("학습"),
    PERSONAL("개인"),
    HEALTH("건강"),
    OTHER("기타");

    private final String displayname;

    // ... 기존 코드 생략

    Category(String displayname) {
        this.displayname = displayname;
    }

    public String getDisplayName() {
        return displayname;
    }

    public static Category fromNumber(int number) {
        // 여기에 코드 작성
        // 1 → WORK, 2 → STUDY, ... 5 → OTHER
        if (number < 1 || number > values().length) {
            throw new IllegalArgumentException("잘못된 구분 번호: " + number);
        }
        return values()[number - 1];

    }

}

public class Main {
    public static void main(String[] args) {
        Category cat = Category.fromNumber(2);
        System.out.println(cat);
    }
}
