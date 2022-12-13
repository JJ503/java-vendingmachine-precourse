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
        enterProducts(enterVendingMachineProducts(), products);
    }

    private int enterVendingMachineAmount() {
        return inputView.readVendingMachineAmount();
    }

    private List<Map<String, Object>> enterVendingMachineProducts() {
        return inputView.readVendingMachineProducts();
    }

    private Products enterProducts(List<Map<String, Object>> productInforms, Products products) {
        for (Map<String, Object> product : productInforms) {
            products.addProduct(new Product(
                    (String) product.get("name"),
                    (Integer) product.get("price"),
                    (Integer) product.get("quantity")
            ));
        }

        return products;
    }
}
