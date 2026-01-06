package com.nhn.academy.todo.model;

public enum Category {
    WORK(1, "업무"),
    STUDY(2, "공부"),
    PERSONAL(3, "인성"),
    HEALTH(4, "건강"),
    OTHER(5, "그 외");

    private final int num;
    private final String displayname;

    Category(int num, String displayname) {
        this.num = num;
        this.displayname = displayname;
    }

    public int getNum() {
        return num;
    }

    public String getDisplayName() {
        return this.displayname;
    }

    public static Category fromNumber(int number) {
        if (number < 1 || number > values().length) {
            throw new IllegalArgumentException("잘못된 구분 번호: " + number);
        }

        return values()[number - 1];
    }

}
