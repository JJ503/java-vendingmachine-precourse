package vendingmachine;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public enum Coin {
    COIN_500(500),
    COIN_100(100),
    COIN_50(50),
    COIN_10(10);

    private static final Map<Integer, Coin> COINS = Stream.of(values())
            .collect(Collectors.toMap(Coin::getAmount, Function.identity()));
    private final int amount;

    Coin(final int amount) {
        this.amount = amount;
    }

    public int getAmount() {
        return amount;
    }

    public static Coin getCoin(int coinAmount) {
        return COINS.get(coinAmount);
    }
}
