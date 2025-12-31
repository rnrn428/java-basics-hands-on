package step7.practice_13;

enum Status {
    TODO("할 일"),
    IN_PROGRESS("진행 중"),
    DONE("완료");

    private final String displayName;

    Status(String displayName) {
        this.displayName = displayName;
    }

    public String getDisplayName() {
        return displayName;
    }

}

public class Main {
    public static void main(String[] args) {
        Status[] state = Status.values();

        for (Status c : state) {
            System.out.println(c.name() + ": " + c.getDisplayName());
        }

    }

}
