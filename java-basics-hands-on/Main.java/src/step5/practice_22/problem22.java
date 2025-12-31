package step5.practice_22;

import java.util.ArrayList;

public class problem22 {
    public static void main(String[] args) {
        ArrayList<Integer> arr1 = new ArrayList<>();
        arr1.add(10);
        arr1.add(20);
        arr1.add(30);

        System.out.println("첫 번째: " + arr1.get(0));
        System.out.println("마지막: " + arr1.get(2));

        System.out.println("전체 개수: " + arr1.size());

    }
}
