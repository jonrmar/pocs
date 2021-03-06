package google.guice.examples.bindings.linked.binding;

import com.google.inject.Inject;
import google.guice.examples.Receipt;
import google.guice.examples.caculator.Calculator;
import google.guice.examples.logger.Logger;

import java.math.BigDecimal;

public class BillingService {

    private Logger logger;
    private Calculator calculator;

    @Inject
    BillingService(Logger logger, Calculator calculator) {
        this.logger = logger;
        this.calculator = calculator;
    }

    public void collectOrder(Receipt receipt){
        BigDecimal total = calculator.calcTotal(receipt);

        logger.log("The amount of your order is: R$ " + total.toString());
    }
}
