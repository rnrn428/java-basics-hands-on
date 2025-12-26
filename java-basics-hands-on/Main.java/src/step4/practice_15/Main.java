package step4.practice_15;


import java.util.ArrayList;

class Todo{
    public Todo(){
        
    }
}

public class Main {
    public static void main(String[] args){
        ArrayList<Todo> todo = new ArrayList<Todo>();
        todo.add(new Todo());
        todo.add(new Todo());

        System.out.println("TODO 개수 " + todo.size());
    }

}
