package com.nhn.academy.todo.service;

import java.util.ArrayList;
import java.util.List;

import com.nhn.academy.todo.exception.TodoNotFoundException;
import com.nhn.academy.todo.model.Category;
import com.nhn.academy.todo.model.Priority;
import com.nhn.academy.todo.model.Todo;

public class TodoService {
    private ArrayList<Todo> arr = new ArrayList<>();

    public void add(Todo todo) {
        for (Todo t : arr) {
            if (t.getTitle().equals(todo.getTitle())) {
                throw new IllegalArgumentException("동일한 제목의 일정이 이미 존재합니다.");
            }
        }
        arr.add(todo);
    }

    public List<Todo> getAll() {
        return arr;
    }

    public int count() {
        return arr.size();
    }

    public boolean isDuplicate(String title) {
        for (Todo todo : arr) {
            if (todo.getTitle().equals(title)) {
                return true;
            }
        }
        return false;
    }

    public void printAll() {
        if (arr.isEmpty()) {
            System.out.println("등록된 TODO가 없습니다.");
        } else {
            System.out.println("=== TODO 목록 ===");
            for (int i = 0; i < arr.size(); i++) {
                Todo todo = arr.get(i);
                String status = todo.isDone() ? "[완료]" : "[미완료]";
                System.out.println("[" + (i + 1) + "] " + todo.getTitle() + " | " + todo.getHours() + "시간 | "
                        + todo.getCategory() + " | "
                        + todo.getPriority() + " | " + status);
            }
        }

    }

    public void printCat(Category category) {

    }

    public void printPr(Priority priority) {

    }

    public void update(int targetIndex, String title, int hours) {
        if (targetIndex < 0 || targetIndex >= arr.size()) {
            throw new TodoNotFoundException(targetIndex);
        }

        Todo todo = arr.get(targetIndex);
        todo.setTitle(title);
        todo.setHours(hours);
    }

    public void delete(int targetIndex) {
        if (targetIndex < 0 || targetIndex >= arr.size()) {
            throw new TodoNotFoundException(targetIndex);
        }

        arr.remove(targetIndex);
    }

}
