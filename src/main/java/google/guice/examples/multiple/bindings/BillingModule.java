package google.guice.examples.multiple.bindings;

import com.google.inject.AbstractModule;
import google.guice.examples.caculator.Calculator;
import google.guice.examples.caculator.OrderCalculator;
import google.guice.examples.logger.ConsoleLogger;
import google.guice.examples.logger.Logger;

public class BillingModule extends AbstractModule {
    @Override
    protected void configure() {
        // Annotated Bindings
        bind(Logger.class).to(ConsoleLogger.class);
        bind(Calculator.class).annotatedWith(Order.class).to(OrderCalculator.class);
    }
}
