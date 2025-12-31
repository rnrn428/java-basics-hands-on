package step7.practice_12;

enum Category {
    WORK("업무"),
    STUDY("학습"),
    PERSONAL("개인"),
    HEALTH("건강"),
    OTHER("기타");

    private final String displayname;

    Category(String displayname) {
        this.displayname = displayname;
    }

    public String getDisplayName() {
        return displayname;
    }

    public static Category fromNumber(int number) {
        if (number < 1 || number > values().length) {
            throw new IllegalArgumentException("잘못된 구분 번호: " + number);
        }

        return values()[number - 1];
    }
}

public class Main {
    public static void main(String[] args) {
        int num = 2; // 사용자가 2를 입력했다고 가정
        Category category = Category.fromNumber(num);
        System.out.println("선택: " + category.getDisplayName());
    }
}
