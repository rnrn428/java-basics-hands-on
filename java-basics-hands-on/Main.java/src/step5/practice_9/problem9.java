package step5.practice_9;

import java.util.*;

class Todo {
    String title;
    int time;
    boolean done;

    public Todo(String title, int time, boolean done) {
        this.title = title;
        this.time = time;
        this.done = done;
    }

    public String getTitle() {
        return title;
    }

    public boolean isDone() {
        return done;
    }

}

public class problem9 {
    public static void main(String[] args) {
        ArrayList<Todo> todoList = new ArrayList<>();
        todoList.add(new Todo("공부", 3, false));
        todoList.add(new Todo("운동", 1, true));
        todoList.add(new Todo("독서", 2, false));
        todoList.add(new Todo("청소", 1, true));

        for (Todo todo : todoList) {
            if (todo.isDone()) {
                System.out.println(todo.getTitle());
            }
        }

        // 완료된 항목만 출력하는 코드 작성
    }
}
