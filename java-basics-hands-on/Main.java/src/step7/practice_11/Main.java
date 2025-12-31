package step7.practice_11;

enum Category {
    WORK("업무"),
    STUDY("학습");

    private final String displayname;

    Category(String displayname) {
        this.displayname = displayname;
    }

    public String getDisplayName() {
        return displayname;
    }
}

enum Priority {
    LOW(1),
    MEDIUM(2),
    HIGH(3);

    private final int level;

    public int getLevel() {
        return level;
    }

    Priority(int level) {
        this.level = level;
    }

}

class Todo {
    String title;
    Category category;
    Priority priority;

    public Todo(String title, Category category, Priority priority) {
        this.title = title;
        this.category = category;
        this.priority = priority;
    }

    public Category getCategory() {
        return category;
    }

    public Priority getPriority() {
        return priority;
    }

}

public class Main {
    public static void main(String[] args) {
        Todo todo = new Todo("Java 공부", Category.STUDY, Priority.HIGH);
        System.out.println(todo.getCategory().getDisplayName());
        System.out.println(todo.getPriority().getLevel());
    }
}
