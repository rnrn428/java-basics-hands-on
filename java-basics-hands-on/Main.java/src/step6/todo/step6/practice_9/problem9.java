package step6.todo.step6.practice_9;

class Counter {
    private int count;

    public Counter() {
        count = 0;
    }

    public void increment() {
        count += 1;
    }

    public int getCount() {
        return count;
    }

}

public class problem9 {
    public static void main(String[] args) {
        Counter counter = new Counter();

        System.out.println(counter.getCount());
        counter.increment();

        System.out.println(counter.getCount());
        counter.increment();

        System.out.println(counter.getCount());

    }
}
