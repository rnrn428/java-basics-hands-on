package step2.practice_14;

public class Main {
    public static void main(String[] args) {
        int n = 5;
        int sum = 0;
        while (n > 0) {
            sum += n;
            n--;
        }
        System.out.println("합계: " + sum);
    }
}
