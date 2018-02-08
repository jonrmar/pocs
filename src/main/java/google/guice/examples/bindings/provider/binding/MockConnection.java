package google.guice.examples.bindings.provider.binding;

import com.google.inject.Singleton;

@Singleton
class MockConnection implements Connection {
    @Override
    public void connect() {
        System.out.println("Connecting");
    }

    @Override
    public void disconnect() {
        System.out.println("Disconnecting");
    }
}
