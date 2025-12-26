package step4.practice_1;


class Book{
    private String title;
    private int price;

    public Book(String title, int price){
        this.title = title;
        this.price = price;
    }
    public String getTitle(){
        return title;
    }
    public int getPrice(){
        return price;
    }
}


public class Main {
    public static void main(String[] args){

        Book book = new Book("어린왕자", 50000);

        System.out.println("책 제목은 "+ book.getTitle() + " 가격은 " + book.getPrice());
    }

}
