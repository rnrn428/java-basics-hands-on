package step12.practice_23;

import java.util.*;

public class MultiInterfaceExercise23 {
    interface Identifiable {
        int getId();
    }

    interface Completable {
        boolean isDone();

        void setDone(boolean done);
    }

    // TODO: Todo 클래스가 두 인터페이스를 모두 구현하도록 선언하세요
    static class Todo implements Identifiable, Completable {
        private int id;
        private String title;
        private boolean done;

        public Todo(int id, String title) {
            this.id = id;
            this.title = title;
            this.done = false;
        }

        public String getTitle() {
            return title;
        }

        // TODO: Identifiable 인터페이스 구현
        @Override
        public int getId() {
            return this.id;
        }

        // TODO: Completable 인터페이스 구현
        @Override
        public boolean isDone() {
            return this.done;
        }

        @Override
        public void setDone(boolean done) {
            this.done = done;
        }
    }

    public static void main(String[] args) {
        List<Todo> todos = new ArrayList<>();
        todos.add(new Todo(1, "Java 공부"));
        todos.add(new Todo(2, "운동하기"));
        todos.add(new Todo(3, "독서"));

        // 2번 TODO 완료 처리
        todos.get(1).setDone(true);

        System.out.println("=== TODO 상태 ===");
        for (Todo todo : todos) {
            String status = todo.isDone() ? "완료" : "미완료";
            System.out.printf("[%d] %s - %s%n", todo.getId(), todo.getTitle(), status);
        }
    }
}