package step5.practice_23;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class problem23 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> arr1 = new ArrayList<>();

        while (true) {

            System.out.println("메뉴: 0.입장 1.퇴장 2.종료");
            System.out.print("선택: ");
            String num = reader.readLine();

            if ("0".equals(num)) {
                System.out.print("이름: ");
                String name = reader.readLine();
                arr1.add(name);
                System.out.println(name + " 입장");
            } else if ("1".equals(num)) {
                if (arr1.isEmpty()) {
                    System.out.println("대기열이 비어있습니다.");
                } else {
                    System.out.println(arr1.get(0) + " 퇴장");
                    arr1.remove(0);
                }
            } else if ("2".equals(num)) {
                System.out.println("종료합니다.");
                return;
            }
        }

    }
}
