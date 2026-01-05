package step11.practice_5;

public class UrlSlugGenerator {
    public static void main(String[] args) {
        String title = "  Hello World Java Programming  ";

        String url = title.trim().replace(" ", "-").toLowerCase();

        System.out.println("원본: '  " + title + "  '");

        System.out.println("Slug: " + url);

        // TODO: 메서드 체이닝을 사용하여 URL slug를 생성하세요
        // 결과: "hello-world-java-programming"

        // TODO: 여러 제목에 대해 테스트하세요
        String[] titles = {
                "  Java Tutorial  ",
                "Spring Boot Guide",
                "  Clean Code Practices  "
        };

        for (String tit : titles) {
            String in = tit.trim()
                    .replace(" ", "-")
                    .toLowerCase();

            System.out.println(tit + " -> " + in);

        }
    }

}
