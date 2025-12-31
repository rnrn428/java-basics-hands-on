package step2.practice_12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("나이: ");
        String ageStr = reader.readLine();
        int age = Integer.parseInt(ageStr);
        System.out.println("입력한 나이; " + age);
    }
}
