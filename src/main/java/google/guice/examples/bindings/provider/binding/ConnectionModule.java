package google.guice.examples.bindings.provider.binding;

import com.google.inject.AbstractModule;
import com.google.inject.Singleton;

public class ConnectionModule extends AbstractModule {
    @Override
    protected void configure() {
        bind(Connection.class).toProvider(ConnectionProvider.class);
    }
}
