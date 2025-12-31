package step5.practice_2;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;

        System.out.print("시작: ");
        int start = scanner.nextInt();

        System.out.print("끝: ");
        int end = scanner.nextInt();

        if (start > end) {
            System.out.println("첫 번째 숫자는 두 번째 숫자보다 작거나 같아야 합니다.");
        } else {
            for (int i = start; i <= end; i++) {
                sum += i;
            }
            System.out.println("합계: " + sum);
        }

        scanner.close();

    }

}
