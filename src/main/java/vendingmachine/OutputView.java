package vendingmachine;

public class OutputView {
    private static final String PRINT_VENDING_MACHINE_COINS = "\n자판기가 보유한 동전";
    private static final String PRINT_CONSUMER_BUDGET = "\n투입 금액: %d원\n";

    public void printVendingMachineCoins(String vendingMachineCoins) {
        System.out.println(PRINT_VENDING_MACHINE_COINS);
        System.out.println(vendingMachineCoins);
    }

    public void printConsumerBudget(int budget) {
        System.out.printf(PRINT_CONSUMER_BUDGET, budget);
    }
}
