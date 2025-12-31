package step5.practice_34;

public class problem34 {
    public static void main(String[] args) {
        SimpleArrayList list = new SimpleArrayList();

        System.out.println("비어있음: " + list.isEmpty()); // true
        System.out.println("크기: " + list.size()); // 0

        list.add("Java");
        list.add("Python");
        System.out.println("크기: " + list.size()); // 2

        // 초기 용량(2)을 초과하여 추가 - 배열 확장 발생
        list.add("JavaScript");
        list.add("C++");
        list.add("Go");

        System.out.println("비어있음: " + list.isEmpty()); // false
        System.out.println("크기: " + list.size()); // 5
        System.out.println("첫 번째: " + list.get(0)); // Java
        System.out.println("다섯 번째: " + list.get(4)); // Go
    }
}
