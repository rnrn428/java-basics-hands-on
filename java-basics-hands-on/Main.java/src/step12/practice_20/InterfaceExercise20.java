package step12.practice_20;

import java.util.*;
import java.util.stream.Collectors;

public class InterfaceExercise20 {
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

    // TODO: 함수형 인터페이스로 선언하세요
    @FunctionalInterface
    interface SearchStrategy {
        // TODO: Todo를 받아 boolean을 반환하는 추상 메서드를 선언하세요
        boolean matches(Todo todo);
    }

    // TODO: 제목 검색 전략을 구현하세요
    static class TitleSearchStrategy implements SearchStrategy {
        private String keyword;

        public TitleSearchStrategy(String keyword) {
            this.keyword = keyword;
        }

        @Override
        public boolean matches(Todo todo) {
            return todo.getTitle().contains(keyword);
        }
    }

    public static void main(String[] args) {
        List<Todo> todoList = new ArrayList<>();
        todoList.add(new Todo("Java 공부", 3));
        todoList.add(new Todo("운동하기", 1));
        todoList.add(new Todo("Java 프로젝트", 5));

        // 검색 전략 사용
        SearchStrategy strategy = new TitleSearchStrategy("Java");

        List<Todo> results = todoList.stream()
                .filter(todo -> strategy.matches(todo))
                .collect(Collectors.toList());

        System.out.println("=== 'Java' 검색 결과 ===");
        for (Todo todo : results) {
            System.out.println(todo.getTitle());
        }
        System.out.println("총 " + results.size() + "건");
    }
}