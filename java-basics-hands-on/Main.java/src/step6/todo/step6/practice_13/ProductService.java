package step6.todo.step6.practice_13;

import java.util.ArrayList;
import java.util.List;

public class ProductService {
    private List<Product> productList = new ArrayList<>();

    public void add(Product product) {
        productList.add(product);
    }

    public List<Product> getAll() {
        return productList;
    }

    public int count() {
        return productList.size();
    }
}
