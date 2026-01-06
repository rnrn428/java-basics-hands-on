package step12.practice_17;

import java.util.*;
import java.util.stream.Collectors;

public class MethodRefExercise17 {
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

        // 람다 표현식 버전
        List<String> titles = todoList.stream()
                .map(todo -> todo.getTitle())
                .collect(Collectors.toList());

        // TODO: map 안의 람다를 메서드 레퍼런스로 변환하세요
        List<String> titlesRef = todoList.stream()
                .map(Todo::getTitle)
                .collect(Collectors.toList());

        System.out.println("=== 제목 목록 ===");
        for (String title : titlesRef) {
            System.out.println(title);
        }
    }
}