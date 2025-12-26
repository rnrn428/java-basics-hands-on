package step3.practice_26;

public class Main {
    public static void main(String[] args){
        int i = 0;
        while(i < 10){
            i++;
            if(i % 3 == 0){
                continue;
            }
            System.out.println(i);
        }

    }
}
