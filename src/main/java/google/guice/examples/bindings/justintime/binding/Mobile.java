package google.guice.examples.bindings.justintime.binding;


public class Mobile {
    private String number;

    public Mobile() {
        this.number = "11111111111";
    }

    @Override
    public String toString() {
        return "Mobile{" +
                "number='" + number + '\'' +
                '}';
    }
}
