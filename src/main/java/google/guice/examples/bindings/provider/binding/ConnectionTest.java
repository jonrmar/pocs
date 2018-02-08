package google.guice.examples.bindings.provider.binding;

import com.google.inject.Guice;
import com.google.inject.Injector;

public class ConnectionTest {
    public static void main(String[] args) {
        Injector injector = Guice.createInjector(new ConnectionModule());

        MockConnection mockConnection = injector.getInstance(MockConnection.class);

        mockConnection.connect();
        mockConnection.disconnect();
    }
}
