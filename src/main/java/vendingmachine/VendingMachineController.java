package vendingmachine;

public class VendingMachineController {
    InputView inputView = new InputView();
    OutputView outputView = new OutputView();

    public void operateVendingMachine() {
        VendingMachine vendingMachine = new VendingMachine(enterVendingMachineAmount());
        outputView.printVendingMachineCoins(vendingMachine.getVendingMachineCoins());
    }

    private int enterVendingMachineAmount() {
        return inputView.readVendingMachineAmount();
    }
}
