package step4.practice_18;


import java.util.ArrayList;


class Todo{
    String title;
    int num;
    boolean done;

    public Todo(String title, int num, boolean done){
        this.title = title;
        this.num = num;
        this.done = done;
    }

    public String getTitle(){
        return title;
    }
    public boolean isDone(){
        return this.done;
    }

    
}

public class Main {
    public static void main(String[] args){
        ArrayList<Todo> todoList = new ArrayList<>();
        todoList.add(new Todo("Java", 3, false));
        todoList.add(new Todo("Spring", 5, true));

        for(Todo todo : todoList){
            String status = todo.isDone() ? "완료" : "미완료";
            System.out.println(todo.getTitle() + " - " + status);
        }


    }

}
