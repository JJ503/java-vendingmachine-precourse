package vendingmachine;

import java.util.List;
import java.util.Map;

public class VendingMachineController {
    InputView inputView = new InputView();
    OutputView outputView = new OutputView();

    public void operateVendingMachine() {
        VendingMachine vendingMachine = new VendingMachine(enterVendingMachineAmount());
        outputView.printVendingMachineCoins(vendingMachine.getVendingMachineCoins());
        Products products = new Products();
    }

    private int enterVendingMachineAmount() {
        return inputView.readVendingMachineAmount();
    }

    private List<Map<String, Object>> enterVendingMachineProducts() {
        return inputView.readVendingMachineProducts();
    }
}
