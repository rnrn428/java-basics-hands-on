package step4.practice_6;


class Todo{
    String athlete;
    int day;
    boolean done =false;

    public Todo(String athlete, int day, boolean done){
        this.athlete = athlete;
        this.day = day;
        this.done = done;
    }

    public boolean isDone(){
        return this.done;
    }
    public void setDone(boolean done){
        this.done = done;
    }

}

public class Main {
    public static void main(String[] args){

        Todo todo = new Todo("운동", 1, false);
        System.out.println(todo.isDone());
        todo.setDone(true);
        System.out.println(todo.isDone());

    }

}
