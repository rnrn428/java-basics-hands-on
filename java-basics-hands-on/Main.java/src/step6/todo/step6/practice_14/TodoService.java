package step6.todo.step6.practice_14;

import java.util.ArrayList;
import java.util.List;

public class TodoService {
    private List<Todo> todoList = new ArrayList<>();

    public void add(Todo todo) {
        todoList.add(todo);
    }

    public List<Todo> getAll() {
        return todoList;
    }

    public int count() {
        return todoList.size();
    }

    public void printAll() {
        if (todoList.isEmpty()) {
            System.out.println("등록된 TODO가 없습니다.");
        } else {
            System.out.println("=== TODO 목록 ===");
            for (int i = 0; i < todoList.size(); i++) {
                Todo todo = todoList.get(i);
                String status = todo.isDone() ? "[완료]" : "[미완료]";
                System.out.println((i + 1) + ". " + status + " " + todo.getTime());
            }
        }

    }
}
