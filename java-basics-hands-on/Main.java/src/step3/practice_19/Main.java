package step3.practice_19;

public class Main {
    public static void main(String[] args){
        int day = 3;
        switch(day){
            case 1: case 2: case 3: case 4: case 5:
                System.out.println("평일"); // 출력
                break;
            case 6: case 7:
                System.out.println("주말");
                break;
            default:
                System.out.println("잘못된 입력");
        }

    }

}
