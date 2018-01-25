package google.guice.examples;

import java.math.BigDecimal;
import java.util.Map;

public class Receipt {

    private Map<String, BigDecimal> itens;

    public Map<String, BigDecimal> getItens() {
        return itens;
    }

    public void setItens(Map<String, BigDecimal> itens) {
        this.itens = itens;
    }


}
