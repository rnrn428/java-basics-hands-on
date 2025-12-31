package step7.practice_5;

enum Priority {
    LOW(1, "낮음"),
    MEDIUM(2, "보통"),
    HIGH(3, "높음");

    private final int level;
    private final String displayName;

    Priority(int level, String displayName) {
        this.level = level;
        this.displayName = displayName;
    }

    public int getLevel() {
        return level;
    }

    public String getDisplayName() {
        return displayName;
    }
}

public class Main {
    public static void main(String[] args) {
        Priority p1 = Priority.LOW;
        Priority p2 = Priority.MEDIUM;
        Priority p3 = Priority.HIGH;

        System.out.println(p1.getLevel() + " " + p1.getDisplayName());
        System.out.println(p2.getLevel() + " " + p2.getDisplayName());
        System.out.println(p3.getLevel() + " " + p3.getDisplayName());

    }

}
