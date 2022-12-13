package vendingmachine;

import java.util.Collections;

public class ConsumerBudget {
    private static final int ZERO = 0;

    private int budget;

    ConsumerBudget(int budget) {
        this.budget = budget;
    }

    public int getBudget() {
        return budget;
    }

    public void subtractBudget(int price) {
        budget -= price;
    }

    public boolean isOverZero() {
        return budget > ZERO;
    }
}
