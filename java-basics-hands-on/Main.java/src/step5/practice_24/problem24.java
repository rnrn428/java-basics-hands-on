package step5.practice_24;

import java.util.ArrayList;

class Todo {
    String name;
    String grade;

    public Todo(String name, String grade) {
        this.name = name;
        this.grade = grade;
    }

}

public class problem24 {
    public static void main(String[] args) {
        ArrayList<Todo> arr1 = new ArrayList<>();

        arr1.add(new Todo("이재웅", "A+"));
        arr1.add(new Todo("김태빈", "C+"));

        System.out.println("전체 개수: " + arr1.size());

    }
}
