package step2.practice_9;

public class Main {
    public static void main(String[] args) {
        Integer value = null;
        // int result = value + 10;

        int result = (value != null) ? value + 10 : 10;
        System.out.println(result); // -> NullPointerException 발생 value가 null인데 unboxing (
                                    // Integer -> int변환)을 시도하면서 예외 발생
    }
}
