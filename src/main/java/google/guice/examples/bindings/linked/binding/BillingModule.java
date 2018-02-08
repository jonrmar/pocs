package google.guice.examples.bindings.linked.binding;

import com.google.inject.AbstractModule;
import google.guice.examples.caculator.Calculator;
import google.guice.examples.caculator.OrderCalculator;
import google.guice.examples.logger.ConsoleLogger;
import google.guice.examples.logger.Logger;

public class BillingModule extends AbstractModule {
    @Override
    protected void configure() {
        // Linked Bindings
        bind(Logger.class).to(ConsoleLogger.class);
        bind(Calculator.class).to(OrderCalculator.class);
    }
}
