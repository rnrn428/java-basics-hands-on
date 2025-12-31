package step5.practice_30;

public class problem30 {
    public static void main(String[] args) {
        String a = "true";
        String b = "false";
        String c = "TRUE";
        String d = "yes";

        System.out.println("\"true\" -> " + Boolean.parseBoolean(a));
        System.out.println("\"false\" -> " + Boolean.parseBoolean(b));
        System.out.println("\"TRUE\" -> " + Boolean.parseBoolean(c));
        System.out.println("\"yes\" -> " + Boolean.parseBoolean(d));

    }
}
