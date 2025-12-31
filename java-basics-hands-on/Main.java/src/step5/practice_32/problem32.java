package step5.practice_32;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

class Todo {

    String input;
    int time;

    public Todo(String input, int time) {
        this.input = input;
        this.time = time;
    }

    public String getInput() {
        return input;
    }

    public int getTime() {
        return time;
    }

}

public class problem32 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Todo> arr1 = new ArrayList<>();

        for (int i = 0; i < 2; i++) {
            System.out.print("할 일: ");
            String input = reader.readLine();
            System.out.print("에상 시간(시): ");
            int time = Integer.parseInt(reader.readLine());
            arr1.add(new Todo(input, time));
        }

        System.out.println("=== TODO 목록 ===");

        for (int i = 0; i < arr1.size(); i++) {
            Todo todo = arr1.get(i);
            System.out.println((i + 1) + ". " + todo.getInput() + " (" + todo.getTime() + "시간)");
        }

    }
}
