package vendingmachine;

public class Product {
    private final String name;
    private final int price;
    private final int quantity;

    Product(String name, int price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public boolean isMatchName(String name) {
        return this.name.equals(name);
    }
}
