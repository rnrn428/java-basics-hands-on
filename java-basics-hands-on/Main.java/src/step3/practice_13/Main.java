package step3.practice_13;

public class Main {
    public static void main(String[] args){
        int x = 10;
        int y = 5;
        if(x > 5 && y > 3){ // true && trye -> true 만족
            System.out.println("조건1 만족");
        }
        if(x > 15 || y > 3){ // false || true -> true 만족
            System.out.println("조건2 만족");
        }
        if(!(x < 5)){ // !false -> true 만족
            System.out.println("조건3 만족");
        }

    }

}
