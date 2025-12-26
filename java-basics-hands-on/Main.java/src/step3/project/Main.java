package step3.project;

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args)throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));


        while(true){
            
            System.out.println("=== TODO 앱 ===");
            System.out.println("1. 등록");
            System.out.println("2. 조회");
            System.out.println("0. 종료");
            System.out.print("선택 > ");
            String input = reader.readLine();

            switch(input){
                case "0":
                    System.out.println("프로그램을 종료합니다.");
                    System.out.println();
                    return;
                case "1":
                    System.out.println("[등록] 메뉴 선택됨");
                    System.out.println();
                    break;
                case "2":
                    System.out.println("[조회] 메뉴 선택됨");
                    System.out.println();
                    break;
                default:
                    System.out.println("잘못된 입력입니다. 다시 선택바랍니다.");
                    System.out.println();
            }     
            
        }
    }
}


