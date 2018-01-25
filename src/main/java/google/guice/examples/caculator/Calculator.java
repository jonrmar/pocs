package google.guice.examples.caculator;

import google.guice.examples.Receipt;

import java.math.BigDecimal;

public interface Calculator {
    BigDecimal calcTotal(Receipt receipt);
}
