package vendingmachine;

import java.util.Collections;

public class ConsumerBudget {
    private final int budget;

    ConsumerBudget(int budget) {
        this.budget = budget;
    }

    public int getBudget() {
        return budget;
    }
}
