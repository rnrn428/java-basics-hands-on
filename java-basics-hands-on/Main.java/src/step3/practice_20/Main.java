package step3.practice_20;

public class Main {
    public static void main(String[] args){
        int a = 10, b = 3;
        String op = "/";
        int result = 0;

        switch(op){
            case "+":
                result = a + b;
                break;
            case "-":
                result = a - b;
                break;
            case "*":
                result = a * b;
                break;
            case "/":
                result = a / b; // 3 출력
                break;

        }
        System.out.println(a + " " + op + " " + b + " = " + result);

    }
}
