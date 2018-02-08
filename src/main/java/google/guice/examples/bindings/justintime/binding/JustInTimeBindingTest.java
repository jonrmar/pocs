package google.guice.examples.bindings.justintime.binding;

import com.google.inject.Guice;
import com.google.inject.Injector;

public class JustInTimeBindingTest {

    public static void main(String[] args) {
        Injector injector = Guice.createInjector();
        Person person = injector.getInstance(Person.class);

        person.display();
    }
}
