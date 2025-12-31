package step6.todo.service;

import java.util.ArrayList;
import java.util.List;

import step6.todo.model.Todo;

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
}
