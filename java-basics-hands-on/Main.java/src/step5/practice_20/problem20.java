package step5.practice_20;

import java.util.*;

public class problem20 {
    public static void main(String[] args) {
        // // 최대 3개까지만 저장 가능
        // String[] todoArray = new String[3];
        // int count = 0;

        // // 3개 저장 - 정상
        // todoArray[count++] = "Java 공부";
        // todoArray[count++] = "운동하기";
        // todoArray[count++] = "독서";

        // // 4번째 저장 시도 - 예외 발생!
        // todoArray[count++] = "영화 보기";

        // System.out.println("저장된 TODO: " + count + "개");

        ArrayList<String> arr1 = new ArrayList<>();
        arr1.add("Java 공부");
        arr1.add("운동하기");
        arr1.add("독서");
        arr1.add("영화 보기");

        System.out.println("저장된 TODO: " + arr1.size() + "개");

    }
}
