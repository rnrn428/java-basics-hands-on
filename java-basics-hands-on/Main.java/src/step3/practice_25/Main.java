package step3.practice_25;

public class Main {
    public static void main(String[] args){
        int i = 0;
        while(i < 5){
            i++;
            
            if(i == 3){
                break;
            }
            System.out.println(i);
        }

        System.out.println("종료");
    }
}
