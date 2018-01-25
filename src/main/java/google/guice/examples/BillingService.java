package google.guice.examples;

import com.google.inject.Inject;
import google.guice.examples.caculator.Calculator;
import google.guice.examples.logger.ConsoleLogger;

import java.math.BigDecimal;

public class BillingService {

    private ConsoleLogger logger;
    private Calculator calculator;

    @Inject
    public BillingService(ConsoleLogger logger, Calculator calculator) {
        this.logger = logger;
        this.calculator = calculator;
    }

    void cobrarPedido(Receipt receipt){
        BigDecimal total = calculator.calcTotal(receipt);

        logger.log("O valor do seu pedido é: R$ " + total.toString());
    }
}
