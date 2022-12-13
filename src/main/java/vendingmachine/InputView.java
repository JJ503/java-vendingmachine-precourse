package vendingmachine;

import camp.nextstep.edu.missionutils.Console;

import java.util.List;
import java.util.Map;

public class InputView {
    private static final String INPUT_VENDING_MACHINE_AMOUNT = "자판기가 보유하고 있는 금액을 입력해 주세요.";
    private static final String INPUT_VENDING_MACHINE_PRODUCTS = "상품명과 가격, 수량을 입력해 주세요.";
    private static final String INPUT_CONSUMER_BUDGET = "투입 금액을 입력해 주세요.";
    private static final String INPUT_PRODUCT_NAME_TO_PURCHASE = "구매할 상품명을 입력해 주세요.";
    private static final String SPACE = " ";
    private static final String NONE = "";

    private final InputValidation inputValidation = new InputValidation();

    public int readVendingMachineAmount() {
        System.out.println(INPUT_VENDING_MACHINE_AMOUNT);
        return inputValidation.validateAmount(Console.readLine());
    }

    public List<Map<String, Object>> readVendingMachineProducts() {
        System.out.println(INPUT_VENDING_MACHINE_PRODUCTS);
        return inputValidation.validateProducts(Console.readLine().replaceAll(SPACE, NONE));
    }

    public int readConsumerBudget() {
        System.out.println(INPUT_CONSUMER_BUDGET);
        return inputValidation.validateAmount(Console.readLine());
    }

    public String readProductNameToPurchase() {
        System.out.println(INPUT_PRODUCT_NAME_TO_PURCHASE);
        return inputValidation.validateProductName(Console.readLine().replaceAll(SPACE, NONE));
    }
}
