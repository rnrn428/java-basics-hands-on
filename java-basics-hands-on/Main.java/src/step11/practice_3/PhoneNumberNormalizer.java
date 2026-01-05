package step11.practice_3;

public class PhoneNumberNormalizer {
    public static void main(String[] args) {
        String[] phones = {
                "010-1234-5678",
                "010 1234 5678",
                "(010) 1234-5678",
                "010.1234.5678"
        };

        for (String phone : phones) {
            String cleaned = phone.replace("-", "")
                    .replace(" ", "")
                    .replace("(", "")
                    .replace(")", "")
                    .replace(".", "");

            String formatted = cleaned.substring(0, 3) + "-" +
                    cleaned.substring(3, 7) + "-" +
                    cleaned.substring(7, 11);

            System.out.println(phone + " -> " + formatted);
        }
    }

}
