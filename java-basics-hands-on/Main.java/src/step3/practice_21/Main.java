package step3.practice_21;

public class Main {
    public static void main(String[] args){
        int day = 3;
        String type = switch(day){
            case 1, 2, 3, 4, 5 -> "퍙일";
            case 6, 7 -> "주말";
            default -> "잘못된 입력";
        };
        System.out.println(type);

    }

}
