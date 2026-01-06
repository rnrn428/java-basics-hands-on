package step12.practice_18;

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PredicateExercise18 {
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

    public static void main(String[] args) {
        List<Todo> todoList = new ArrayList<>();
        todoList.add(new Todo("긴급 보고서", Priority.HIGH, false));
        todoList.add(new Todo("회의 준비", Priority.HIGH, true));
        todoList.add(new Todo("이메일 확인", Priority.LOW, false));
        todoList.add(new Todo("프로젝트 검토", Priority.HIGH, false));

        // 개별 조건 정의
        Predicate<Todo> isNotDone = todo -> !todo.isDone(); // false
        Predicate<Todo> isHighPriority = todo -> todo.getPriority() == Priority.HIGH; // Priority -> HIGH

        // TODO: 두 조건을 AND로 조합하세요 (미완료 AND 높은 중요도) ***
        Predicate<Todo> urgentTodos = isNotDone.and(isHighPriority);

        // TODO: 조합된 Predicate로 필터링
        List<Todo> result = todoList.stream()
                .filter(urgentTodos)
                .collect(Collectors.toList());

        System.out.println("=== 긴급 미완료 TODO ===");
        for (Todo todo : result) {
            System.out.println(todo.getTitle() + " [" + todo.getPriority() + "]");
        }
        System.out.println("총 " + result.size() + "건");
    }
}