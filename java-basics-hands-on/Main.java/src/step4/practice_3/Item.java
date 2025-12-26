package step4.practice_3;

public class Item {
    private String name;
    private int count;

    public Item(String name, int count){
        this.name = name; // this 추가
        this.count = count; // this 추가
    }

    public String getName(){
        return name;
    }
    public int getCount(){
        return count;
    }
}
