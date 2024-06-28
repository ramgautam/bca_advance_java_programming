package events;

import java.util.EventListener;

public interface MyBeanListener extends EventListener {
    void handleMyBeanEvent(MyBeanEvent event);
}