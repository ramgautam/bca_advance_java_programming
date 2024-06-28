package events;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BeanTestEvent  {
    public static void main(String[] args) {
        MyBean myBean = new MyBean();

        // Add a listener to the bean
        myBean.addMyBeanListener(new MyBeanListener() {
            @Override
            public void handleMyBeanEvent(MyBeanEvent event) {
                System.out.println("Event received: " + event.getMessage());
            }
        });

        // Perform an action that triggers the event
        myBean.doSomething();
    }
}
