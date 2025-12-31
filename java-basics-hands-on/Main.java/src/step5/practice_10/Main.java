package step5.practice_10;

import java.util.ArrayList;

class Todo {
    private String active;
    private int time;
    private boolean completed;

    public Todo(String active, int time, boolean completed) {
        this.active = active;
        this.time = time;
        this.completed = completed;
    }

    public String getActive() {
        return active;
    }

    public boolean isCompleted() {
        return completed;
    }

    public int getTime() {
        return time;
    }

    public void setActive(String active) {
        this.active = active;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }

}

public class Main {
    public static void main(String[] args) {
        ArrayList<Todo> todoList = new ArrayList<>();
        todoList.add(new Todo("공부", 3, false));
        todoList.add(new Todo("운동", 1, true));
        todoList.add(new Todo("독서", 2, false));
        todoList.add(new Todo("청소", 1, true));

        // 완료된 항목만 출력하는 코드 작성
        for (Todo todo : todoList) {
            if (todo.isCompleted()) {
                System.out.println(todo.getActive() + " " + todo.getTime() + " " + todo.isCompleted());
            }
        }
    }

}
