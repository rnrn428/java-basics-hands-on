package step12.practice_19;

import java.util.*;
import java.util.function.Consumer;

public class ConsumerExercise19 {
    static class Todo {
        private String title;
        private int hours;

        public Todo(String title, int hours) {
            this.title = title;
            this.hours = hours;
        }

        public String getTitle() {
            return title;
        }

        public int getHours() {
            return hours;
        }

    }

    public static void main(String[] args) {
        List<Todo> todoList = new ArrayList<>();
        todoList.add(new Todo("Java 공부", 3));
        todoList.add(new Todo("운동하기", 1));
        todoList.add(new Todo("독서", 2));

        // TODO: 각 Todo를 출력하는 Consumer를 정의하세요
        Consumer<Todo> printTodo = todo -> System.out.println(todo.getTitle());

        System.out.println("=== TODO 목록 ===");
        // TODO: forEach에 Consumer를 전달하세요
        todoList.forEach(printTodo);
    }
}