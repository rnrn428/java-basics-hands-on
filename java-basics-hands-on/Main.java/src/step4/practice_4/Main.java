package step4.practice_4;


class Todo{

    String title;
    int hours;
    boolean done = false;

    public Todo(String title, int hours, boolean done){
        this.title = title;
        this.hours = hours;
        this.done = done;
    }

    public String getTitle(){
        return title;
    }
    public int getHours(){
        return hours;
    }
    public boolean isDone(){
        return false;
    }
}

public class Main {
    public static void main(String[] args){
        Todo todo = new Todo("공부하기", 2, false);
        System.out.println(todo.getTitle());
        System.out.println(todo.getHours());
        System.out.println(todo.isDone());
    }
}
