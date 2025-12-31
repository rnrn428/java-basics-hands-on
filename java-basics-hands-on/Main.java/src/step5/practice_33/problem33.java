package step5.practice_33;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

class Todo {
    private String active;
    private int time;
    private boolean done;

    public Todo(String active, int time, boolean done) {
        this.active = active;
        this.time = time;
        this.done = done;
    }

    public String getActive() {
        return active;
    }

    public int getTime() {
        return time;
    }

    public boolean isDone() {
        return done;
    }

}

public class problem33 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<Todo> arr1 = new ArrayList<>();

        while (true) {
            System.out.println("메뉴: 1. 등록 2.조회 0.종료");
            System.out.print("선택: ");
            String input = reader.readLine();

            switch (input) {
                case "1":
                    System.out.print("할 일: ");
                    String active = reader.readLine();
                    System.out.print("시간: ");
                    int time = Integer.parseInt(reader.readLine());
                    arr1.add(new Todo(active, time, false));
                    System.out.println("등록 완료!");
                    break;

                case "2":
                    if (arr1.isEmpty()) {
                        System.out.println("등록된 TODO가 없습니다.");
                    } else {
                        System.out.println("=== TODO 목록 ===");
                        for (int i = 0; i < arr1.size(); i++) {
                            Todo todo = arr1.get(i);
                            String status = todo.isDone() ? "[완료]" : "[미완료]";
                            System.out.println(
                                    (i + 1) + ". " + status + " " + todo.getActive() + "(" + todo.getTime() + "시간)");
                        }
                    }
                    break;

                case "0":
                    System.out.println("종료합니다.");
                    return;

                default:
                    System.out.println("잘못된 선택입니다.");

            }
        }
    }

}