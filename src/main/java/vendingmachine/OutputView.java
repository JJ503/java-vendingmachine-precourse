package vendingmachine;

public class OutputView {
    private static final String PRINT_VENDING_MACHINE_COINS = "자판기가 보유한 동전";

    public void printVendingMachineCoins(String vendingMachineCoins) {
        System.out.println(PRINT_VENDING_MACHINE_COINS);
        System.out.println(vendingMachineCoins);
    }
}
