package bound_constaint;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

public class Person {
    private String name;
    private int age;
    private final PropertyChangeSupport support;

    public Person() {
        support = new PropertyChangeSupport(this);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        String oldName = this.name;
        this.name = name;
        support.firePropertyChange("name", oldName, name);
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        int oldAge = this.age;
        this.age = age;
        support.firePropertyChange("age", oldAge, age);
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        support.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        support.removePropertyChangeListener(listener);
    }
}
