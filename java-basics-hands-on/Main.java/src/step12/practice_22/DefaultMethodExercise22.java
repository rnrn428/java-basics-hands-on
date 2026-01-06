package step12.practice_22;

import java.util.*;

public class DefaultMethodExercise22 {
    enum Priority {
        HIGH("높음"), MEDIUM("보통"), LOW("낮음");

        private String displayName;

        Priority(String displayName) {
            this.displayName = displayName;
        }

        public String getDisplayName() {
            return displayName;
        }
    }

    interface Printable {
        String getDisplayText();

        // TODO: default 메서드를 정의하세요 (대괄호로 감싸서 출력)
        default void printFormatted() {
            System.out.println("[" + getDisplayText() + "]");
        }
    }

    // Todo 클래스에서 구현
    static class Todo implements Printable {
        private String title;
        private Priority priority;

        public Todo(String title, Priority priority) {
            this.title = title;
            this.priority = priority;
        }

        // TODO: getDisplayText 메서드를 구현하세요
        @Override
        public String getDisplayText() {
            return title + " (" + priority.getDisplayName() + ")";
        }

        // printFormatted()는 구현하지 않아도 됨 (default 메서드)
    }

    public static void main(String[] args) {
        List<Todo> todos = new ArrayList<>();
        todos.add(new Todo("회의 준비", Priority.HIGH));
        todos.add(new Todo("이메일 확인", Priority.LOW));
        todos.add(new Todo("보고서 작성", Priority.MEDIUM));

        System.out.println("=== TODO 출력 (default 메서드 활용) ===");
        for (Todo todo : todos) {
            todo.printFormatted();
        }
    }
}