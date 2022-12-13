package vendingmachine;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class InputValidation {
    private static final int UNIT_OF_MONEY = 10;
    private static final String SEMICOLON = ";";
    private static final String COMMA = ",";

    public int validateAmount(String checkAmount) {
        isExistValue(checkAmount);
        int amount = getNumber(checkAmount);
        isDividedBy10(amount);

        return amount;
    }

    public List<List<String>> validateProducts(String checkProducts) {
        isExistValue(checkProducts);
        return getProductsInformationList(checkProducts);
    }

    private void isExistValue(String checkValue) {
        if (checkValue.isEmpty()) {
            ExceptionMessage.ENTER_NOTHING.throwException();
        }
    }

    private Integer getNumber(String checkValue) {
        try {
            return Integer.parseInt(checkValue);
        } catch (NumberFormatException numberFormatException) {
            ExceptionMessage.IS_NOT_NUMBER.throwException();
        }

        return null;
    }

    private void isDividedBy10(int checkValue) {
        if (checkValue % UNIT_OF_MONEY != 0) {
            ExceptionMessage.IS_NOT_DIVIDED_BY_10.throwException();
        }
    }

    private List<List<String>> getProductsInformationList(String checkValue) {
        List<String> products = Arrays.asList(checkValue.split(SEMICOLON));
        List<List<String>> productsInforms = new ArrayList<>();

        for (String product : products) {
            productsInforms.add(isThreeInformation(product));
        }

        return productsInforms;
    }

    private List<String> isThreeInformation(String product) {
        List<String> productInforms = Arrays.asList(product.split(COMMA));
        if (productInforms.size() == 3) {
            return productInforms;
        }

        ExceptionMessage.IS_NOT_THREE_INFORMATION.throwException();
        return null;
    }
}
