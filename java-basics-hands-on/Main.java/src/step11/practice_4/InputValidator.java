package step11.practice_4;

public class InputValidator {
    public static void main(String[] args) {
        String todoTitle = "  Java 공부  ";
        String url = "http://example.com/api";
        String filename = "report.pdf";

        String study = todoTitle.trim();
        System.out.println("정제된 제목: " + "'" + study + "'");

        if (study.contains("Java")) {
            System.out.println("✔️ Java 관련 항목입니다.");
        } else {
            System.out.println("Java와 관련이 없습니다.");
        }

        if (url.startsWith("https")) {
            System.out.println("✔️ 보안 연결(HTTPS)입니다.");
        } else {
            System.out.println("⚠️ 비보안 연결(HTTP)입니다.");
        }

        if (filename.trim().endsWith(".pdf")) {
            System.out.println("✔️ PDF 파일입니다.");
        } else {
            System.out.println("⚠️ 알 수 없는 파일 형식입니다.");
        }

        // TODO: todoTitle의 앞뒤 공백을 제거하세요

        // TODO: "Java"라는 키워드가 포함되어 있는지 확인하세요

        // TODO: URL이 https로 시작하는지 확인하세요

        // TODO: 파일이 .pdf 확장자로 끝나는지 확인하세요

        // TODO: 검증 결과를 출력하세요
    }

}
