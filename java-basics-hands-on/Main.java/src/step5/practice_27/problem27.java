package step5.practice_27;

import java.util.ArrayList;

class Todo {
    String title;
    int time;
    boolean status;

    public Todo(String title, int time, boolean status) {
        this.title = title;
        this.time = time;
        this.status = status;
    }

    public String getTitle() {
        return title;
    }

    public boolean isStatus() {
        return status;
    }

}

public class problem27 {
    public static void main(String[] args) {
        ArrayList<Todo> arr1 = new ArrayList<>();

        arr1.add(new Todo("Java", 3, false));
        arr1.add(new Todo("Spring", 5, true));

        for (Todo todo : arr1) {
            String status = todo.isStatus() ? "완료" : "미완료";
            System.out.println(todo.getTitle() + " - " + status);
        }

    }
}
