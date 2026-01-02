package com.nhn.academy.todo.model;

public enum Category {
    WORK(1),
    STUDY(2),
    PERSONAL(3),
    HEALTH(4),
    OTHER(5);

    private final int num;

    Category(int num) {
        this.num = num;
    }

    public int getNum() {
        return num;
    }

    public static Category fromNumber(int number) {
        if (number < 1 || number > values().length) {
            throw new IllegalArgumentException("잘못된 구분 번호: " + number);
        }

        return values()[number - 1];
    }
}
