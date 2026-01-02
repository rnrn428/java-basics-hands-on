package step6.todo.step6.practice_14;

public class Todo {
    private String active;
    private int time;
    private boolean done;

    public Todo(String active, int time, boolean done) {
        this.active = active;
        this.time = time;
        this.done = done;
    }

    public String getActive() {
        return active;
    }

    public int getTime() {
        return time;
    }

    public boolean isDone() {
        return done;
    }

    public void setActive(String active) {
        this.active = active;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public void setDone(boolean done) {
        this.done = done;
    }

}
