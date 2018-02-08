package google.guice.examples.bindings.linked.binding;

import google.guice.examples.Receipt;
import google.guice.examples.caculator.Calculator;
import google.guice.examples.logger.Logger;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import java.math.BigDecimal;
import java.util.HashMap;

public class BillingServiceTest {

    private BillingService billingService;
    private Logger logger;
    private Calculator calculator;

    @Before
    public void setup() {
        this.logger = Mockito.mock(Logger.class);
        this.calculator = Mockito.mock(Calculator.class);
        this.billingService = new BillingService(logger, calculator);
    }

    @Test
    public void cobrarPedidoTest() {
        Mockito.when(calculator.calcTotal(Mockito.any(Receipt.class))).thenReturn(new BigDecimal(10.00));

        billingService.collectOrder(mockReceipt());

        Mockito.verify(calculator, Mockito.times(1)).calcTotal(Mockito.any(Receipt.class));
    }

    private Receipt mockReceipt() {
        HashMap<String, BigDecimal> itens = new HashMap<>();

        itens.put("Pizza", new BigDecimal(20.0));
        itens.put("Ketchup", new BigDecimal(5.80));
        itens.put("Refrigerante", new BigDecimal(5.0));

        Receipt receipt = new Receipt();
        receipt.setItens(itens);

        return receipt;
    }
}
