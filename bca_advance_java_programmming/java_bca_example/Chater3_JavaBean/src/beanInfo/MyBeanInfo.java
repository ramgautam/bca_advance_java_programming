package beanInfo;

import java.beans.*;

public class MyBeanInfo {
    public static void main(String[] args) {
        try {
            // Get the BeanInfo for MyBean
            BeanInfo beanInfo = Introspector.getBeanInfo(MyBean.class);

            // Print bean descriptor
            BeanDescriptor beanDescriptor = beanInfo.getBeanDescriptor();
            System.out.println("Bean Descriptor:");
            System.out.println("Bean Class: " + beanDescriptor.getBeanClass());
            System.out.println("Customizer Class: " + beanDescriptor.getCustomizerClass());

            // Print property descriptors
            System.out.println("\nProperty Descriptors:");
            for (PropertyDescriptor propertyDescriptor : beanInfo.getPropertyDescriptors()) {
                System.out.println("Property Name: " + propertyDescriptor.getName());
                System.out.println("Property Type: " + propertyDescriptor.getPropertyType());
                System.out.println("Read Method: " + propertyDescriptor.getReadMethod());
                System.out.println("Write Method: " + propertyDescriptor.getWriteMethod());
                System.out.println();
            }

            // Print method descriptors
            System.out.println("Method Descriptors:");
            for (MethodDescriptor methodDescriptor : beanInfo.getMethodDescriptors()) {
                System.out.println("Method Name: " + methodDescriptor.getName());
                System.out.println("Method: " + methodDescriptor.getMethod());
                System.out.println();
            }

            // Print event set descriptors
            System.out.println("Event Set Descriptors:");
            for (EventSetDescriptor eventSetDescriptor : beanInfo.getEventSetDescriptors()) {
                System.out.println("Event Name: " + eventSetDescriptor.getName());
                System.out.println("Listener Type: " + eventSetDescriptor.getListenerType());
                System.out.println("Add Listener Method: " + eventSetDescriptor.getAddListenerMethod());
                System.out.println("Remove Listener Method: " + eventSetDescriptor.getRemoveListenerMethod());
                System.out.println();
            }

            // Print default property and event indexes
            System.out.println("Default Property Index: " + beanInfo.getDefaultPropertyIndex());
            System.out.println("Default Event Index: " + beanInfo.getDefaultEventIndex());

            // Print icon (if any)
            System.out.println("Icon: " + beanInfo.getIcon(BeanInfo.ICON_COLOR_16x16));

        } catch (IntrospectionException e) {
            e.printStackTrace();
        }
    }
}
