package step7.practice_2;

enum Category {
    WORK,
    STUDY,
    PERSONAL,
    HEALTH,
    OTHER
}

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성하세요
        Category cat = Category.STUDY;

        switch (cat) {
            case WORK:
                System.out.println("업무");
                break;
            case STUDY:
                System.out.println("학습");
                break;
            default:
                System.out.println("기타");
        }

    }
}
