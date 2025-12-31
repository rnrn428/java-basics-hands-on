package step7.practice_4;

enum Category {
    WORK("업무"),
    STUDY("학습"),
    PERSONAL("개인");

    private final String displayName;

    Category(String displayName) {
        this.displayName = displayName;
    }

    public String getDisplayName() {
        return displayName;
    }

}

public class Main {
    public static void main(String[] args) {
        Category c1 = Category.WORK;
        Category c2 = Category.STUDY;
        System.out.println(c1.getDisplayName());
        System.out.println(c2.getDisplayName());
    }

}
