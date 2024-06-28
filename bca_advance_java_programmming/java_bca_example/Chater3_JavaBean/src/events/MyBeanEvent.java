package events;

import java.util.EventObject;

public class MyBeanEvent extends EventObject {
    private final String message;

    public MyBeanEvent(Object source, String message) {
        super(source);
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}