package vendingmachine;

import camp.nextstep.edu.missionutils.Randoms;

import java.util.Arrays;
import java.util.List;

public class RandomCoinAmount {
    private static final List<Integer> coins = Arrays.asList(10, 50, 100, 500);

    public static int randomCoinAmount() {
        return Randoms.pickNumberInList(coins);
    }
}
