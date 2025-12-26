package step3.practice_23;

public class Main {
    public static void main(String[] args){
        int score = 85;
        String grade = switch(score / 10){
            case 10, 9 -> "A";
            case 8 -> "B";
            case 7 -> "C";
            default -> {
                System.out.println("재시험 대상입니다.");
                yield "F";
            }
        };

        System.out.println("학잠: " + grade);

    }

}
