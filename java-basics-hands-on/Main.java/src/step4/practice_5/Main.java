package step4.practice_5;


class Book{
    String title;

    public Book(String title){
        this.title = title;
    }

    public String getTitle(){
        return title;
    }

}

public class Main {
    public static void main(String[] args){
        Book book = new Book("Java 입문");

        System.out.println("책 제목은 " + book.getTitle());

    }

}
