package step5.practice_14;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> items = new ArrayList<>();
        items.add("Python");
        items.add("Java");
        items.add("JavaScript");

        for (String item : items) {
            if (item.equals("Java")) {
                System.out.println("찾았습니다!");
                break;
            }
            System.out.println("검색 중: " + item);
        }

    }

}
