package vendingmachine;

public class Product {
    private static final int ZERO = 0;

    private final String name;
    private final int price;
    private final int quantity;

    Product(String name, int price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public boolean canBePurchase(String name) {
        return isMatchName(name) && isExistQuantity();
    }

    private boolean isMatchName(String name) {
        return this.name.equals(name);
    }

    private boolean isExistQuantity() {
        return quantity > ZERO;
    }
}
