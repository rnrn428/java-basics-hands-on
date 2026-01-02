package com.nhn.academy.todo.model;

public class Todo {
    private String title;
    private int hours;
    private boolean done;
    private Category category;
    private Priority priority;

    public Todo(String title, int hours, Category category, Priority priority, boolean done) {

        if (title == null || title.isEmpty()) {
            throw new IllegalArgumentException("타이틀 오류");
        }

        if (hours <= 0) {
            throw new IllegalArgumentException("시간 오류");
        }

        this.title = title;
        this.hours = hours;
        this.category = category;
        this.priority = priority;
        this.done = done;
    }

    public String getTitle() {
        return title;
    }

    public int getHours() {
        return hours;
    }

    public boolean isDone() {
        return done;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public void setDone(boolean done) {
        this.done = done;
    }

    public Category getCategory() {
        return category;
    }

    public Priority getPriority() {
        return priority;
    }

}
