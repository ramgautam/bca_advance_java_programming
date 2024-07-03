package bound_constaint;

public class Main {
    public static void main(String[] args) {
        Person person = new Person();
        PersonPropertyChangeListener listener = new PersonPropertyChangeListener();

        // Add the listener to the person bean
        person.addPropertyChangeListener(listener);

        // Change properties
        person.setName("John Doe");
        person.setAge(30);

        // Remove the listener
        person.removePropertyChangeListener(listener);

        // Change properties again
        person.setName("Jane Doe");
        person.setAge(25);
    }
}

