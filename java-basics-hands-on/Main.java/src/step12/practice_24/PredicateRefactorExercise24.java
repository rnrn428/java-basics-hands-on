package step12.practice_24;

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PredicateRefactorExercise24 {
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

    private static List<Todo> todoList = new ArrayList<>();

    // TODO: 표준 함수형 인터페이스로 변경하세요
    // Predicate<T>: T를 받아 boolean 반환
    public static List<Todo> search(Predicate<Todo> condition) {
        return todoList.stream()
                .filter(condition)
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        todoList.add(new Todo("긴급 보고서", Priority.HIGH, false));
        todoList.add(new Todo("회의 준비", Priority.HIGH, true));
        todoList.add(new Todo("이메일 확인", Priority.LOW, false));
        todoList.add(new Todo("프로젝트 마무리", Priority.HIGH, false));

        // TODO: Predicate를 사용하여 호출하세요
        List<Todo> highPriority = search(todo -> todo.getPriority() == Priority.HIGH);

        // Predicate 조합
        Predicate<Todo> isUrgent = todo -> todo.getPriority() == Priority.HIGH; // 가장 중요하면서
        Predicate<Todo> isNotDone = todo -> !todo.isDone(); // 아직 끝나지 않은 것

        List<Todo> urgentUndone = search(isUrgent.and(isNotDone)); // and 함수로 가장 중요하면서 and 아직 끝나지 않은 것을 검색함.

        System.out.println("=== HIGH 중요도 ===");
        for (Todo todo : highPriority) {
            System.out.println(todo.getTitle()); // 우선순위가 높은 것들만 출력
        }

        System.out.println("\n=== 긴급 미완료 (조합) ===");
        for (Todo todo : urgentUndone) {
            System.out.println(todo.getTitle()); // 미완료인 것들만 출력
        }
    }
}