package step6.todo;

import step6.todo.model.Todo;
import step6.todo.service.TodoService;

//import java.util.List;

public class Main {
    public static void main(String[] args) {
        TodoService service = new TodoService(); // Servie 오브젝트 생성

        service.add(new Todo("공부", 3, false));

        System.out.println("작업 개수: " + service.count());

        // 문제 5. Todo todo = new Todo("공부", 3, false);
        // 문제 5. service.add(todo); // Service의 add메서드로 Todo 등록

        // 문제 5. List<Todo> list = service.getAll(); // 등록된 모든 Todo 목록 변환
        // 문제 5. System.out.println("등록된 TODO: " + list.size() + "개");

        // 문제 6. Todo todo = new Todo("Java", 2, false);
        // 문제 6. Todo todo2 = new Todo("Spring", 3, false);
        // 문제 6. service.add(todo);
        // 문제 6. service.add(todo2);

        // 문제 6. System.out.println(service.count());
        // 문제 6. System.out.println(service.getAll().get(0).getTitle());

    }
}