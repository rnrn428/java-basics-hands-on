package step5.practice_14;

public class problem14 {
    public static void main(String[] args) {
        String[] colors = { "빨강", "파랑", "노랑" };

        System.out.println("====== for문 ======");

        for (int i = 0; i < colors.length; i++) {
            System.out.println(colors[i]);
        }

        System.out.println("====== for-each문 ======");

        for (String color : colors) {
            System.out.println(color);
        }

    }
}
