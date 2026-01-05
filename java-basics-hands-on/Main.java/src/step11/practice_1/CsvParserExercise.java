package step11.practice_1;

public class CsvParserExercise {
    public static void main(String[] args) {
        String csvLine = "홍길동,30,서울,true";

        String[] person = csvLine.split(",");

        String name = person[0];
        int age = Integer.parseInt(person[1]);
        String city = person[2];
        boolean isActive = Boolean.parseBoolean(person[3]);

        System.out.println("이름: " + name + ", 나이: " + age + ", 도시: " + city + ", 활성: " + isActive);
    }

}
