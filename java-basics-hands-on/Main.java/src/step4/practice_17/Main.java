package step4.practice_17;


import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        ArrayList<String> names = new ArrayList<>();
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");

        for(int i=0; i<names.size(); i++){
            System.out.println(i+1 +". " + names.get(i));
        }
    }

}
