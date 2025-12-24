package step2.project;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args){
        try{
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            
            while(true){
                System.out.print("입력 (종료: quit) > ");
                String str = reader.readLine();

                if("quit".equals(str)){
                    System.out.println("프로그램을 종료합니다.");
                    break;
                }

                System.out.println("입력한 값: " + str);

            }


        }catch(IOException e){

        }



    }
}
