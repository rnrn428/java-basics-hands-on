package step4.practice_10;

public class Main {
    public static void main(String[] args){
        String[] todoArray = new String[3];

        int count = 0;

        todoArray[count++] = "Java 공부"; // count[0] 저장 후 count[1] 넘어감.
        todoArray[count++] = "운동하기"; // count[1] 저장 후 count[2] 넘어감.
        todoArray[count++] = "독서"; // count[2] 저장 후 count[3] 넘어감.

        //todoArray[count++] = "영화 보기"; // count[3] 저장하려고 했더니 배열 저장공간 초과 xx

        System.out.println("저장된 TODO: " + count + "개");

    }

}
