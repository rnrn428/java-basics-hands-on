package step5.practice_13;

import java.util.*;

public class problem13 {
    public static void main(String[] args) {
        ArrayList<String> arr1 = new ArrayList<>();

        arr1.add("Python");
        arr1.add("Java");
        arr1.add("JavaScript");

        for (int i = 0; i < arr1.size(); i++) {
            if (arr1.get(i) == "Java") {
                System.out.println("찾았습니다!");
                break;
            }
            System.out.println("검색 중 : " + arr1.get(i));
        }

    }
}
