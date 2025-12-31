package step6.todo.step6.practice_10;

import step6.todo.model.Todo;
import step6.todo.service.TodoService;

public class problem10 {
    public static void main(String[] args) {
        TodoService service = new TodoService();
        service.add(new Todo("공부", 2, false));
        System.out.println(service.getAll().size());
    }
}
