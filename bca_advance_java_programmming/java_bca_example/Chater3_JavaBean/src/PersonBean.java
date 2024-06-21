import java.io.Serializable;

public class PersonBean implements Serializable {
    private String name;
    private int age;

    // No-argument constructor
    public PersonBean() {
    }

    // Getter for name property
    public String getName() {
        return name;
    }

    // Setter for name property
    public void setName(String name) {
        this.name = name;
    }

    // Getter for age property
    public int getAge() {
        return age;
    }

    // Setter for age property
    public void setAge(int age) {
        this.age = age;
    }

    // A business logic method
    public String getPersonInfo() {
        return "Name: " + name + ", Age: " + age;
    }
}
