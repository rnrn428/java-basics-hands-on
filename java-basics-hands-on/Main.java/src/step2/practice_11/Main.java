package step2.practice_11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("이름: ");
        String name = reader.readLine();
        System.out.println("입력한 이름: " + name);
    }

}
