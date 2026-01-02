package step6.todo.step6.practice_14;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        TodoService service = new TodoService();

        while (true) {
            System.out.println("1. 등록 2. 조회 0. 종료");
            System.out.print("선택 > ");
            String input = reader.readLine();

            switch (input) {
                case "1":
                    System.out.print("할 일: ");
                    String title = reader.readLine();
                    System.out.print("시간: ");
                    int time = Integer.parseInt(reader.readLine());
                    System.out.println("등록 완료: " + title);
                    service.add(new Todo(title, time, false));
                    break;
                case "2":
                    service.printAll();
                    break;
                case "0":
                    System.out.println("종료합니다.");
                    return;
            }
        }
    }
}
