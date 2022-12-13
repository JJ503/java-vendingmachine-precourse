package vendingmachine;

import java.util.HashMap;
import java.util.Map;

public class VendingMachine {
    private static final String COIN_MESSAGE_FORMAT= "%d원 - %d개\n";
    private final Map<Coin, Integer> vendingMachineCoins;

    VendingMachine(int amount) {
        vendingMachineCoins = initVendingMachineCoins();
        amountToCoinList(amount);
    }

    private HashMap initVendingMachineCoins() {
        return new HashMap(){{
            put(Coin.COIN_10, 0);
            put(Coin.COIN_50, 0);
            put(Coin.COIN_100, 0);
            put(Coin.COIN_500, 0);
        }};
    }

    private void amountToCoinList(int amount) {
        while (amount > 0) {
            amount = createRandomCoin(amount);
        }
    }

    private int createRandomCoin(int amount) {
        Coin randomCoin = Coin.getCoin(RandomCoinAmount.randomCoinAmount());
        int subtractValue = amount - randomCoin.getAmount();
        if (subtractValue > 0) {
            vendingMachineCoins.put(randomCoin, vendingMachineCoins.get(randomCoin) + 1);
            return subtractValue;
        }

        return amount;
    }

    public String getVendingMachineCoins() {
        StringBuilder coinsMessage = new StringBuilder();
        for (Coin coin : vendingMachineCoins.keySet()) {
            coinsMessage.append(String.format(COIN_MESSAGE_FORMAT,
                    coin.getAmount(),vendingMachineCoins.get(coin)));
        }

        return coinsMessage.toString();
    }
}
