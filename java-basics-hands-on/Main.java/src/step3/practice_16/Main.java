package step3.practice_16;

public class Main {
    public static void main(String[] args){
        int a = 15;
        int b = 27;
        int c = 12;
        int max;

        if(a >= b && a >= c){
            max = a;
        }else if(b >= a && b >= c){
            max = b;
        }else{
            max = c;
        }

        System.out.println("가장 큰 수: " + max);

    }

}
