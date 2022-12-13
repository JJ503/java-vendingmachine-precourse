package vendingmachine;

public class InputValidation {
    private static final int UNIT_OF_MONEY = 10;

    public int validateAmount(String checkAmount) {
        isNotExistValue(checkAmount);
        int amount = getNumber(checkAmount);
        isDividedBy10(amount);

        return amount;
    }

    private void isNotExistValue(String checkValue) {
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
}
