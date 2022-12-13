package vendingmachine;

public enum ExceptionMessage {
    ENTER_NOTHING("값을 입력해야 합니다."),
    IS_NOT_NUMBER("금액은 숫자여야 합니다."),
    IS_NOT_DIVIDED_BY_10("금액은 10으로 나누어 떨어져야 합니다."),
    IS_NOT_THREE_INFORMATION("상품 정보는 상품영, 가격, 수량을 입력해야 합니다.");

    private static final String ERROR_TAG = "[ERROR] ";
    private final String errorMessage;

    ExceptionMessage(String errorMessage) {
        this.errorMessage = ERROR_TAG + errorMessage;
    }

    public void throwException() {
        throw new IllegalArgumentException(errorMessage);
    }
}
