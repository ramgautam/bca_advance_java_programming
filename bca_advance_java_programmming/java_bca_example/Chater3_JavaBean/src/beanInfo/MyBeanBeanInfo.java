package beanInfo;

import java.awt.*;
import java.beans.*;

public class MyBeanBeanInfo implements BeanInfo {
    @Override
    public BeanDescriptor getBeanDescriptor() {
        return new BeanDescriptor(MyBean.class);
    }

    @Override
    public PropertyDescriptor[] getPropertyDescriptors() {
        try {
            PropertyDescriptor property1 = new PropertyDescriptor("property1", MyBean.class);
            PropertyDescriptor property2 = new PropertyDescriptor("property2", MyBean.class);
            return new PropertyDescriptor[]{property1, property2};
        } catch (IntrospectionException e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public EventSetDescriptor[] getEventSetDescriptors() {
        return new EventSetDescriptor[0];
    }

    @Override
    public MethodDescriptor[] getMethodDescriptors() {
        try {
            MethodDescriptor myMethod = new MethodDescriptor(MyBean.class.getMethod("myMethod"));
            return new MethodDescriptor[]{myMethod};
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public BeanInfo[] getAdditionalBeanInfo() {
        return new BeanInfo[0];
    }

    @Override
    public int getDefaultPropertyIndex() {
        return 0;  // Index of the default property in getPropertyDescriptors()
    }

    @Override
    public int getDefaultEventIndex() {
        return -1;  // No default event
    }

    @Override
    public Image getIcon(int iconKind) {
        return null;  // No icon
    }
}