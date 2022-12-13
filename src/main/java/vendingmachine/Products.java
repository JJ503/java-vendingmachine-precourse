package vendingmachine;

import java.util.ArrayList;
import java.util.List;

public class Products {
    private final List<Product> products = new ArrayList<>();

    public void addProduct(Product newProduct) {
        products.add(newProduct);
    }
}
