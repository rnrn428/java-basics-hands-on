package step8.practice_1;

public class Main {
    public static void main(String[] args) {
        String input = "abc";
        try {
            int number = Integer.parseInt(input);
            System.out.println("결과: " + number);
        } catch (NumberFormatException e) {
            System.out.println("숫자 형식이 아닙니다: " + input);
            System.err.println("입력 오류 발생: " + e.getMessage());
        } finally {
            System.err.println("프로그램 종료");
        }
    }
}
