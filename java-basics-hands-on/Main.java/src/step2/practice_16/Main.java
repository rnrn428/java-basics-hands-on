package step2.practice_16;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int sum = 0;
        while (true) {
            System.out.print("숫자를 입력하세요 (종료: quit): ");
            String input = reader.readLine();

            if ("quit".equals(input)) {
                System.out.println("최종 합계: " + sum);
                System.out.print("프로그램을 종료합니다.");
                break;
            }

            int inputs = Integer.parseInt(input);
            sum += inputs;
            System.out.println("현재 합계: " + sum);

        }

    }
}
