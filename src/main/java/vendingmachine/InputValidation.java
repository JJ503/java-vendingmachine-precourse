package vendingmachine;

import java.util.*;

public class InputValidation {
    private static final int UNIT_OF_MONEY = 10;
    private static final int ZERO = 0;
    private static final String SEMICOLON = ";";
    private static final String COMMA = ",";

    public int validateAmount(String checkAmount) {
        isExistValue(checkAmount);
        int amount = getAmountNumber(checkAmount);
        isDividedBy10(amount);

        return amount;
    }

    public List<Map<String, Object>> validateProducts(String checkProducts) {
        isExistValue(checkProducts);
        return getProductsInformationList(checkProducts);
    }

    public String validateProductName(String checkProduct) {
        isExistValue(checkProduct);
        return checkProduct;
    }

    private void isExistValue(String checkValue) {
        if (checkValue.isEmpty()) {
            ExceptionMessage.ENTER_NOTHING.throwException();
        }
    }

    private Integer getAmountNumber(String checkValue) {
        try {
            return Integer.parseInt(checkValue);
        } catch (NumberFormatException numberFormatException) {
            ExceptionMessage.INPUT_AMOUNT_IS_NOT_NUMBER.throwException();
        }

        return null;
    }

    private void isDividedBy10(int checkValue) {
        if (checkValue % UNIT_OF_MONEY != 0) {
            ExceptionMessage.IS_NOT_DIVIDED_BY_10.throwException();
        }
    }

    private List<Map<String, Object>> getProductsInformationList(String checkValue) {
        List<String> products = Arrays.asList(checkValue.split(SEMICOLON));
        List<Map<String, Object>> productsInforms = new ArrayList<>();

        for (String product : products) {
            product = product.substring(1, product.length() - 1);
            productsInforms.add(isThreeInformation(product));
        }

        return productsInforms;
    }

    private Map<String, Object> isThreeInformation(String product) {
        List<String> productInforms = Arrays.asList(product.split(COMMA));
        if (productInforms.size() == 3) {
            return validateInformation(productInforms);
        }

        ExceptionMessage.IS_NOT_THREE_INFORMATION.throwException();
        return null;
    }

    private Map<String, Object> validateInformation(List<String> information) {
        return new HashMap<String, Object>() {{
            put("name", information.get(0));
            put("price", validateAmount(information.get(1)));
            put("quantity", validateQuantity(information.get(2)));
        }};
    }

    private int validateQuantity(String checkQuantity) {
        isExistValue(checkQuantity);
        int quantity = getQuantityNumber(checkQuantity);
        isOverZero(quantity);

        return quantity;
    }

    private Integer getQuantityNumber(String checkValue) {
        try {
            return Integer.parseInt(checkValue);
        } catch (NumberFormatException numberFormatException) {
            ExceptionMessage.INPUT_QUANTITY_IS_NOT_NUMBER.throwException();
        }

        return null;
    }

    private void isOverZero(int quantity) {
        if (quantity <= ZERO) {
            ExceptionMessage.IS_NOT_OVER_ZERO.throwException();
        }
    }
}
