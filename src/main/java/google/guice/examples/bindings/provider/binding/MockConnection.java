package google.guice.examples.bindings.provider.binding;

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
