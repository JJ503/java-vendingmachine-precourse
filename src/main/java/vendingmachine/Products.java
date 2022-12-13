package vendingmachine;

public class Products {
    private final String name;
    private final int amount;
    private final int quantity;

    Products(String name, int amount, int quantity) {
        this.name = name;
        this.amount = amount;
        this.quantity = quantity;
    }
}
