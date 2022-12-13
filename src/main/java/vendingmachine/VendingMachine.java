package vendingmachine;

import java.util.HashMap;
import java.util.Map;

public class VendingMachine {
    private final Map<Coin, Integer> vendingMachineCoins;

    VendingMachine(int amount) {
        vendingMachineCoins = initVendingMachineCoins();
    }

    private HashMap initVendingMachineCoins() {
        return new HashMap(){{
            put(Coin.COIN_10, 0);
            put(Coin.COIN_50, 0);
            put(Coin.COIN_100, 0);
            put(Coin.COIN_500, 0);
        }};
    }
}
