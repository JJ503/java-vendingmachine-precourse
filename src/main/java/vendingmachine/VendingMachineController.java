package vendingmachine;

import java.util.List;
import java.util.Map;

public class VendingMachineController {
    InputView inputView = new InputView();
    OutputView outputView = new OutputView();
    VendingMachine vendingMachine;
    Products products;
    ConsumerBudget consumerBudget;

    public void operateVendingMachine() {
        setVendingMachine();
    }

    public void setVendingMachine() {
        vendingMachine = new VendingMachine(enterVendingMachineAmount());
        products = new Products();
        outputView.printVendingMachineCoins(vendingMachine.getVendingMachineCoins());
        enterProducts(enterVendingMachineProducts());
        consumerBudget = new ConsumerBudget(enterConsumerAmount());
    }

    private int enterVendingMachineAmount() {
        return inputView.readVendingMachineAmount();
    }

    private List<Map<String, Object>> enterVendingMachineProducts() {
        return inputView.readVendingMachineProducts();
    }

    private void enterProducts(List<Map<String, Object>> productInforms) {
        for (Map<String, Object> product : productInforms) {
            products.addProduct(new Product(
                    (String) product.get("name"),
                    (Integer) product.get("price"),
                    (Integer) product.get("quantity")
            ));
        }
    }

    private int enterConsumerAmount() {
        return inputView.readConsumerBudget();
    }
}
