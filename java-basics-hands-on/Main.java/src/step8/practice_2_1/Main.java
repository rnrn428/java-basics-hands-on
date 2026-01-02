package step8.practice_2_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Counter {
    private int count = 0;
    private boolean locked = false;

    public void lock() {
        locked = true;
        System.out.println("잠금 시작");
    }

    public void unlock() {
        locked = false;
        System.out.println("잠금 해제");
    }

    public void increment(int value) {
        lock();

        try {
            if (value < 0) {
                throw new IllegalArgumentException("음수는 허용되지 않습니다.");
            }

            count += value;
            System.out.println("현재 값: " + count);
        } catch (Exception e) {
            System.out.println("Exception: 음수는 허용하지 않습니다.");
        } finally {
            unlock();
        }
    }

}

public class Main {
    public static void main(String[] args) {
        Counter counter = new Counter();

        counter.increment(-1);
    }
}