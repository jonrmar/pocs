package google.guice.examples.multiple.bindings;

import com.google.inject.Inject;
import google.guice.examples.Receipt;
import google.guice.examples.caculator.Calculator;
import google.guice.examples.logger.Logger;

import java.math.BigDecimal;

public class BillingService {
    private Logger logger;
    private Calculator calculator;

    @Inject
    BillingService(Logger logger,@Order Calculator calculator) {
        this.logger = logger;
        this.calculator = calculator;
    }

    public void cobrarPedido(Receipt receipt){
        BigDecimal total = calculator.calcTotal(receipt);

        logger.log("O valor do seu pedido é: R$ " + total.toString());
    }
}
