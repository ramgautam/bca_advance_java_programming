package bound_constaint;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

public class PersonPropertyChangeListener implements PropertyChangeListener {
    @Override
    public void propertyChange(PropertyChangeEvent event) {
        System.out.println("Property '" + event.getPropertyName() + "' changed from " +
                event.getOldValue() + " to " + event.getNewValue());
    }
}
