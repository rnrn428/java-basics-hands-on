package step11.practice_9;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class TodoFileSaver {
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
    }

    public static void main(String[] args) throws IOException {
        List<Todo> todos = new ArrayList<>();
        todos.add(new Todo(1, "Java 공부", 3, false));
        todos.add(new Todo(2, "운동하기", 1, true));
        todos.add(new Todo(3, "독서", 2, false));

        String filename = "todos.csv";

        // TODO: try-with-resources를 사용하여 BufferedWriter 생성
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename))) {
            // TODO: 각 TODO를 CSV 형식으로 변환하여 파일에 쓰기
            for (Todo todo : todos) { // CSV 형식 : title, hours, done
                String line = todo.id + "," + todo.title + "," + todo.hours + "," +
                        todo.done;
                writer.write(line);
                writer.newLine(); // 줄바꿈
            }
            System.out.println("파일 저장 완료: " + filename + " (" + todos.size() + "건)");
        } catch (IOException e) { // TODO: IOException 예외 처리
            System.out.println("파일 저장 실패: " + e.getMessage());
        }

        // TODO: 저장 성공 메시지 출력

    }
}