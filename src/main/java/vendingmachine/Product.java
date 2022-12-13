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

    public boolean canBePurchase(String name, int budget) {
        return isMatchName(name) && isExistQuantity() && isLessThanBudget(budget);
    }

    private boolean isMatchName(String name) {
        return this.name.equals(name);
    }

    private boolean isExistQuantity() {
        return quantity > ZERO;
    }

    private boolean isLessThanBudget(int budget) {
        return price <= budget;
    }
}
