package step7.practice_6;

enum Category {
    WORK,
    STUDY,
    PERSONAL,
    HEALTH,
    OTHER
}

public class Main {
    public static void main(String[] args) {
        Category[] categories = Category.values();
        for (Category c : categories) {
            System.out.println(c.ordinal() + ": " + c.name());
        }
    }

}
