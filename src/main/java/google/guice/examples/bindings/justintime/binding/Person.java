package google.guice.examples.bindings.justintime.binding;

import com.google.inject.Inject;

public class Person {

    private Notebook notebook;
    private Mobile mobile;

    @Inject
    public Person(Notebook notebook, Mobile mobile) {
        this.notebook = notebook;
        this.mobile = mobile;
    }

    void display(){
        System.out.println("Mobile: "+ mobile);
        System.out.println("Notebook: "+ notebook);
    }
}
