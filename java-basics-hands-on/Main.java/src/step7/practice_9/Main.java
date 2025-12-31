package step7.practice_9;

class Todo {
    private static int idCounter = 1;

    private int id;
    private String title;

    public Todo(String title) {
        this.id = idCounter++;
        this.title = title;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

}

public class Main {
    public static void main(String[] args) {
        Todo todo1 = new Todo("공부");
        Todo todo2 = new Todo("운동");
        System.out.println(todo1.getId());
        System.out.println(todo2.getId());

    }
}
