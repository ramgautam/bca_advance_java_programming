public class TestPersonBean {
    public static void main(String[] args) {
        // Creating an instance of PersonBean
        PersonBean person = new PersonBean();

        // Setting properties
        person.setName("John Doe");
        person.setAge(30);

        // Getting properties
        System.out.println("Name: " + person.getName());
        System.out.println("Age: " + person.getAge());

        // Using a business logic method
        System.out.println(person.getPersonInfo());
    }
}
