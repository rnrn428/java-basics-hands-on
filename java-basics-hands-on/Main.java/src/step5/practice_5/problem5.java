package step5.practice_5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class problem5 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("단 입력: ");

        String dan = reader.readLine();
        int dna = Integer.parseInt(dan);

        for (int i = 1; i < 10; i++) {
            System.out.println(dna + " x " + i + " = " + i * dna);
        }

    }
}
