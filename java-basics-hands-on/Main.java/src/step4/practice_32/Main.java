package step4.practice_32;

class Todo{
    private String study;
    private int time;
    private boolean done;

    public Todo(String study, int time, boolean done){
        this.study = study;
        this.time = time;
        this.done = done;
    }

    public String getStudy(){
        return study;
    }
    public int getTime(){
        return time;
    }
    public boolean isDone(){
        return done;
    }

}

public class Main {
    public static void main(String[] args){
        Todo todo = new Todo("공부", 3, false);
        System.out.println(todo);
    }

}


// 정답 : Todo@7852e922