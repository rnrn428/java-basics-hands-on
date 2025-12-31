package step5.practice_13;

public class Main {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) {
                continue; // 짝수는 건너뛰기
            }
            System.out.print(i + " ");
        }
    }

}
