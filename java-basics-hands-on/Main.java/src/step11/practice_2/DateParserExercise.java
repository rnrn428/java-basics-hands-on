package step11.practice_2;

public class DateParserExercise {
    public static void main(String[] args) {
        String isoDate = "2024-01-15";

        int year = Integer.parseInt(isoDate.substring(0, 4));
        int month = Integer.parseInt(isoDate.substring(5, 7));
        int day = Integer.parseInt(isoDate.substring(8, 10));

        System.out.printf("%s년 %d월 %d일%n", year, month, day);
    }
}
