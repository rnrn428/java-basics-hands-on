package step4.practice_22;

class Calculator {
    public static int add(int a, int b) {
        return a + b;
    }

    public static int multiply(int a, int b) {
        return a * b;
    }
}

public class Problem22 {
    public static void main(String[] args) {
        int sum = Calculator.add(3, 5); // 8
        int product = Calculator.multiply(4, 6); // 24
        System.out.println(sum); // 8
        System.out.println(product); // 24
    }
}

// 8
// 24