package vendingmachine;

public enum ExceptionMessage {
    ENTER_NOTHING("값을 입력해 주세요.");

    private static final String ERROR_TAG = "[ERROR] ";
    private String errorMessage;

    ExceptionMessage(String errorMessage) {
        this.errorMessage = ERROR_TAG + errorMessage;
    }

    public void throwException() {
        throw new IllegalArgumentException(errorMessage);
    }
}
