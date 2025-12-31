package step6.todo.step6.practice_8;

class Book {
    String title;
    int price;

    public Book(String title, int price) {
        this.title = title;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getInfo() {
        return getTitle() + " - " + getPrice() + "원";

    }
}

public class problem8 {
    public static void main(String[] args) {
        Book book = new Book("Java 입문", 25000);

        System.out.println(book.getInfo());

        book.setPrice(30000);
        System.out.println(book.getInfo());
    }

}