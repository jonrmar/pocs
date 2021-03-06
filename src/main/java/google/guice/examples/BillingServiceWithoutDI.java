package google.guice.examples;

import google.guice.examples.caculator.Calculator;
import google.guice.examples.caculator.OrderCalculator;
import google.guice.examples.logger.ConsoleLogger;
import google.guice.examples.logger.Logger;

import java.math.BigDecimal;

public class BillingServiceWithoutDI {

    private Logger logger = new ConsoleLogger();
    private Calculator calculator = new OrderCalculator();

    void collectOrder(Receipt receipt){
        BigDecimal total = calculator.calcTotal(receipt);

        logger.log("The amount of your order is: R$ " + total.toString());
    }
}
