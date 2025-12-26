package step3.practice_18;

public class Main {
    public static void main(String[] args){
        int num = 2;
        switch(num){
            case 1:
                System.out.println("One");
            case 2:
                System.out.println("Two"); // break문 누락으로 다음으로 흐르게 됨
            case 3:
                System.out.println("Three"); // case2에 이어 출력 하지만 break문이 있어 빠져나갈 수 있음
                break;
            default:
                System.out.println("Other");
                
        }

    }

}
