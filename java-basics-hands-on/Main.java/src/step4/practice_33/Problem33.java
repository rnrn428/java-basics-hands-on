package step4.practice_33;

class Animal {
    public void speak() {
        System.out.println("동물이 소리를 냅니다.");
    }
}

class Dog extends Animal {
    @Override
    public void speak() {
        System.out.println("멍멍!");
    }
}

public class Problem33 {
    public static void main(String[] args) {
        Animal a = new Animal();
        Dog d = new Dog();
        a.speak(); // 동물이 소리를 냅니다.
        d.speak(); // 멍멍!
    }
}