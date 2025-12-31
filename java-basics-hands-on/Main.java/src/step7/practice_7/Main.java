package step7.practice_7;

enum Category {
    WORK,
    STUDY,
    PERSONAL
}

public class Main {
    public static void main(String[] args) {
        Category cat = Category.valueOf("STUDY");
        System.out.println(cat);
    }

}
