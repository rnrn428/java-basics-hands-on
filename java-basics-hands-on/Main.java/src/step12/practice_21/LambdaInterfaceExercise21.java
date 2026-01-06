package step12.practice_21;

import java.util.*;
import java.util.stream.Collectors;

public class LambdaInterfaceExercise21 {
    enum Priority {
        HIGH, MEDIUM, LOW
    }

    static class Todo {
        private String title;
        private Priority priority;
        private boolean done;

        public Todo(String title, Priority priority, boolean done) {
            this.title = title;
            this.priority = priority;
            this.done = done;
        }

        public String getTitle() {
            return title;
        }

        public Priority getPriority() {
            return priority;
        }

        public boolean isDone() {
            return done;
        }
    }

    // 함수형 인터페이스
    @FunctionalInterface
    interface SearchStrategy {
        boolean matches(Todo todo);
    }

    private static List<Todo> todoList = new ArrayList<>();

    // 검색 메서드
    public static List<Todo> search(SearchStrategy strategy) {
        return todoList.stream()
                .filter(todo -> strategy.matches(todo))
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        todoList.add(new Todo("긴급 보고서", Priority.HIGH, false));
        todoList.add(new Todo("회의 준비", Priority.MEDIUM, true));
        todoList.add(new Todo("프로젝트 검토", Priority.HIGH, true));

        // TODO: 람다로 "중요도 HIGH" 검색 전략을 구현하세요
        SearchStrategy highPriority = todoList -> todoList.getPriority() == Priority.HIGH;

        // TODO: search 메서드에 람다를 직접 전달하세요
        List<Todo> doneResults = search(todoList -> todoList.isDone());

        System.out.println("=== HIGH 중요도 TODO ===");
        List<Todo> highResults = search(highPriority);
        for (Todo todo : highResults) {
            System.out.println(todo.getTitle());
        }

        System.out.println("\n=== 완료된 TODO ===");
        for (Todo todo : doneResults) {
            System.out.println(todo.getTitle());
        }
    }
}