package vendingmachine;

public class Product {
    private final String name;
    private final int amount;
    private final int quantity;

    Product(String name, int amount, int quantity) {
        this.name = name;
        this.amount = amount;
        this.quantity = quantity;
    }
}
