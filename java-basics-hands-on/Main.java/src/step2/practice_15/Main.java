package step2.practice_15;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        while(true){
            System.out.print("입력하세요 : ");
            String name = reader.readLine();
            if(name.equals("quit")){
                break;
            }
            System.out.println("입력 결과 값 : " + name);
        }


    }
}
