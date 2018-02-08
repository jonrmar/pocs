package google.guice.examples.bindings.justintime.binding;

public class Notebook {

    private String model;
    private String price;

    public Notebook() {
        this.model = "Sony Vaio";
        this.price = "R$ 5200,00";
    }

    @Override
    public String toString() {
        return "Notebook{" +
                "model='" + model + '\'' +
                ", price='" + price + '\'' +
                '}';
    }
}
