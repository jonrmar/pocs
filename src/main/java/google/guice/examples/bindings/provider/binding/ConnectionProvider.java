package google.guice.examples.bindings.provider.binding;

import com.google.inject.Provider;

public class ConnectionProvider implements Provider<MockConnection>{
    @Override
    public MockConnection get() {
//        Some customization
        MockConnection connection = new MockConnection();
//        More cutomization
        return connection;
    }
}
