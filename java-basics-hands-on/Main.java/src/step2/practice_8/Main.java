package step2.practice_8;

public class Main {
    public static void main(String[] args){
        Integer a = 100; // -> 미리 만들어둔 100번 박스를 가리킴.
        Integer b = 100; // -> 아까 그 100번 박스를 또 가리킴.
        Integer c = 200; // -> 200은 캐시 범위 밖임 Integer -> -128 ~ 127 --> 어 ? 이건 목록에 없네 ? 하며 새로운 박스를 만듦.
        Integer d = 200; // -> 이것도 새로 만들어야겠네. 하며 또 다른 새 박스를 만듦

        System.out.println(a == b);
        System.out.println(c == d); // 둘은 서로 다른 박스 주소니까 c == d는 false;
    }
}
