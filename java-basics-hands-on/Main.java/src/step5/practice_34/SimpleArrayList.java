package step5.practice_34;

import java.util.Arrays;

public class SimpleArrayList {
    private String[] elements;
    private int count;

    public SimpleArrayList() {
        elements = new String[2];
        count = 0;
    }

    public void add(String item) {
        if (count >= elements.length) {
            elements = Arrays.copyOf(elements, elements.length * 2);
        }
        elements[count++] = item;
    }

    public String get(int index) {
        if (index < 0 || count <= index) {
            throw new IndexOutOfBoundsException();
        }

        return elements[index];
    }

    public int size() {
        return count;
    }

    public boolean isEmpty() {
        return count == 0;
    }

}
