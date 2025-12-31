package step5.practice_31;

import java.util.ArrayList;

class Product {
    String name;
    int price;

    public Product(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }
}

public class problem31 {
    public static void main(String[] args) {
        ArrayList<Product> arr1 = new ArrayList<>();

        arr1.add(new Product("샤넬", 30000000));
        arr1.add(new Product("구찌", 2000000));
        arr1.add(new Product("에르메스", 340000000));

        System.out.println("===== 상품 목록 =====");

        for (int i = 0; i < arr1.size(); i++) {
            Product p = arr1.get(i);
            System.out.println((i + 1) + ". " + p.getName() + " - " + p.getPrice() + "원");
        }

    }
}
