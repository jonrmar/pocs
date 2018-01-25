package google.guice.examples.caculator;

import google.guice.examples.Receipt;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Map;

public class OrderCalculator implements Calculator {
    @Override
    public BigDecimal calcTotal(Receipt receipt) {
        BigDecimal total = new BigDecimal("0.0");

        for (Map.Entry<String, BigDecimal> entry : receipt.getItens().entrySet()) {
            total = total.add(entry.getValue());
        }

        return total.setScale(2, RoundingMode.HALF_UP);
    }
}
