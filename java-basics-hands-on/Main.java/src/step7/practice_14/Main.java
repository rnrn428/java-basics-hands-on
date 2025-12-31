package step7.practice_14;

enum Priority {
    LOW(1, "낮음"),
    MEDIUM(2, "보통"),
    HIGH(3, "높음");

    private final int level;
    private final String displayName;

    // 생성자, getter 생략

    Priority(int level, String disPlayName) {
        this.level = level;
        this.displayName = disPlayName;
    }

    public String getDisplayName() {
        return displayName;
    }

    public static Priority fromLevel(int level) {
        // 여기에 코드 작성
        // level이 1이면 LOW, 2이면 MEDIUM, 3이면 HIGH 반환
        // 그 외의 값이면 IllegalArgumentException 발생
        for (Priority p : values()) {
            if (p.level == level) {
                return p;
            }
        }
        throw new IllegalArgumentException("잘못된 중요도: " + level);
    }
}

public class Main {
    public static void main(String[] args) {
        Priority p = Priority.fromLevel(2);

        System.out.println(p.ordinal() + ": " + p);
    }

}
