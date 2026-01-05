package step11.practice_10;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class TodoFileLoader {
    static class Todo {
        int id;
        String title;
        int hours;
        boolean done;

        Todo(int id, String title, int hours, boolean done) {
            this.id = id;
            this.title = title;
            this.hours = hours;
            this.done = done;
        }

        @Override
        public String toString() {
            return String.format("[%d] %s (%dh) - %s",
                    id, title, hours, done ? "완료" : "미완료");
        }
    }

    public static void main(String[] args) {
        String filename = "todos.csv";
        List<Todo> todos = new ArrayList<>();

        File file = new File(filename);

        if (!file.exists()) {
            System.out.println("파일이 없습니다. 빈 리스트로 시작합니다.");
            return;
        }

        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            // 한 줄씩 읽기
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");

                int id = Integer.parseInt(parts[0]);
                String title = parts[1];
                int hours = Integer.parseInt(parts[2]);
                boolean done = Boolean.parseBoolean(parts[3]);

                todos.add(new Todo(id, title, hours, done));
            }
            System.out.println("파일 로드 완료: " + filename + " (" + todos.size() + "건)");

            System.out.println("=== TODO 목록 ===");
            for (Todo todo : todos) {
                System.out.println(todo);
            }

        } catch (IOException e) {
            System.out.println("파일 읽기 실패: " + e.getMessage());
        }

        // TODO: File 객체를 생성하고 파일 존재 여부 확인

        // TODO: try-with-resources로 BufferedReader 생성

        // TODO: 파일을 한 줄씩 읽으면서 CSV 파싱
        // split()으로 분리 후 Todo 객체 생성하여 리스트에 추가

        // TODO: IOException 예외 처리

        // TODO: 로드된 TODO 목록 출력
    }
}

// 파일 로드 완료: todos.csv (3건)
// === TODO 목록 ===
// [1] Java 공부 (3h) - 미완료
// [2] 운동하기 (1h) - 완료
// [3] 독서 (2h) - 미완료