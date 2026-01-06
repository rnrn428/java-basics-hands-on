package com.nhn.academy.todo.service;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
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

    public void printOneTodo(int index, Todo todo) {
        String status = todo.isDone() ? "[완료]" : "[미완료]";
        System.out.println("[" + (index + 1) + "] " + todo.getTitle() + " | " + todo.getHours() + "시간 | "
                + todo.getCategory() + " | "
                + todo.getPriority() + " | " + status);
    }

    public void printCat(Category category) {
        System.out.println("=== 구분별 조회 ===");
        boolean found = false;

        for (int i = 0; i < arr.size(); i++) {
            Todo todo = arr.get(i);
            if (todo.getCategory() == category) {
                printOneTodo(i, todo);
                found = true;
            }
        }

        if (!found) {
            System.out.println("해당 중요도의 할 일이 없습니다.");
        }

    }

    public void printPr(Priority priority) {
        System.out.println("=== 중요도별 조회 ===");
        boolean found = false;

        for (int i = 0; i < arr.size(); i++) {
            Todo todo = arr.get(i);
            if (todo.getPriority() == priority) {
                printOneTodo(i, todo);
                found = true;
            }
        }

        if (!found) {
            System.out.println("해당 중요도의 할 일이 없습니다.");
        }

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

    public void saveToFile(String filename) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename))) {
            for (Todo todo : arr) {
                String line = String.format("%s,%d,%s,%s,%b",
                        todo.getTitle(),
                        todo.getHours(),
                        todo.getCategory().name(),
                        todo.getPriority().name(),
                        todo.isDone());
                writer.write(line);
                writer.newLine();
            }
            System.out.println("파일 저장 완료: " + filename + " (" + arr.size() + "건)");
        } catch (IOException e) {
            System.out.println("파일 저장 실패: " + e.getMessage());
        }
    }

    public void loadFromFile(String filename) {
        File file = new File(filename);
        if (!file.exists()) {
            System.out.println("저장된 파일이 없습니다. 새로 시작합니다.");
            return;
        }

        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            arr.clear();

            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length < 5)
                    continue;

                String title = parts[0];
                int hours = Integer.parseInt(parts[1]);
                Category category = Category.valueOf(parts[2]);
                Priority priority = Priority.valueOf(parts[3]);
                boolean done = Boolean.parseBoolean(parts[4]);

                arr.add(new Todo(title, hours, category, priority, done));
            }
            System.out.println("파일 로드 완료: " + filename + " (" + arr.size() + "건)");
        } catch (IOException e) {
            System.out.println("파일 로드 실패: " + e.getMessage());
        }

    }

}
