package vendingmachine;

import camp.nextstep.edu.missionutils.Console;

public class InputView {
    private static final String INPUT_VENDING_MACHINE_AMOUNT = "자판기가 보유하고 있는 금액을 입력해 주세요.";

    public String readVendingMachineAmount() {
        System.out.println(INPUT_VENDING_MACHINE_AMOUNT);
        return Console.readLine();
    }
}
