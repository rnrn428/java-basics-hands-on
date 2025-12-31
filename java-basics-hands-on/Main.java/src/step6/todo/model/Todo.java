package step6.todo.model;

public class Todo {
    private String title;
    private int time;
    private boolean done;

    public Todo(String title, int time, boolean done) {

        if (title == null || title.isEmpty()) {
            throw new IllegalArgumentException("타이틀 오류");
        }

        if (time <= 0) {
            throw new IllegalArgumentException("시간 오류");
        }

        this.title = title;
        this.time = time;
        this.done = done;
    }

    public String getTitle() {
        return title;
    }

    public int getTime() {
        return time;
    }

    public boolean isDone() {
        return done;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public void setDone(boolean done) {
        this.done = done;
    }

}
