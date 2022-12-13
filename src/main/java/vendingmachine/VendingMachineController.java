package vendingmachine;

public class VendingMachineController {
    InputView inputView = new InputView();
    OutputView outputView = new OutputView();

    public void operateVendingMachine() {

    }

    private int enterVendingMachineAmount() {
        return inputView.readVendingMachineAmount();
    }
}
