package step4.practice_19;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        ArrayList<String> items = new ArrayList<>();
        
        if(items.isEmpty()){
            System.out.println("목록이 비어있습니다.");

        }else{
            for(int i =0; i<items.size(); i++){
                System.out.println(items.get(i));
            }
        }
    }
}
