package google.guice.examples;

import com.google.inject.Guice;
import com.google.inject.Injector;
import google.guice.examples.linked.binding.BillingModule;
import google.guice.examples.linked.binding.BillingService;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        Injector injector = Guice.createInjector(new BillingModule());

        BillingService billingService = injector.getInstance(BillingService.class);

        Receipt receipt = new Receipt();
        receipt.setItens(mockItens());

        billingService.cobrarPedido(receipt);
    }

    private static Map<String, BigDecimal> mockItens() {
        HashMap<String, BigDecimal> itens = new HashMap<>();

        itens.put("Pizza", new BigDecimal(20.0));
        itens.put("Ketchup", new BigDecimal(5.80));
        itens.put("Refrigerante", new BigDecimal(5.0));

        return itens;
    }
}
