package events;

import java.util.ArrayList;
import java.util.List;

public class MyBean {
    private final List<MyBeanListener> listeners = new ArrayList<>();

    public void addMyBeanListener(MyBeanListener listener) {
        listeners.add(listener);
    }

    public void removeMyBeanListener(MyBeanListener listener) {
        listeners.remove(listener);
    }

    protected void fireMyBeanEvent(String message) {
        MyBeanEvent event = new MyBeanEvent(this, message);
        for (MyBeanListener listener : listeners) {
            listener.handleMyBeanEvent(event);
        }
    }

    public void doSomething() {
        // Some logic
        System.out.println("Doing something...");
        // Fire an event
        fireMyBeanEvent("Something happened!");
    }
}