package customizer;

import java.beans.Customizer;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PersonBeanCustomizer extends JPanel implements Customizer {
    private PersonBean personBean;
    private JTextField nameField;
    private JTextField ageField;

    public PersonBeanCustomizer() {
        setLayout(new BorderLayout());

        // Create the name field
        nameField = new JTextField();
        nameField.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (personBean != null) {
                    personBean.setName(nameField.getText());
                }
            }
        });

        // Create the age field
        ageField = new JTextField();
        ageField.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (personBean != null) {
                    try {
                        int age = Integer.parseInt(ageField.getText());
                        personBean.setAge(age);
                    } catch (NumberFormatException ex) {
                        JOptionPane.showMessageDialog(PersonBeanCustomizer.this, "Invalid age");
                    }
                }
            }
        });

        // Add the fields to the panel
        add(new JLabel("Name:"), BorderLayout.WEST);
        add(nameField, BorderLayout.CENTER);
        add(new JLabel("Age:"), BorderLayout.WEST);
        add(ageField, BorderLayout.CENTER);
    }

    @Override
    public void setObject(Object bean) {
        if (bean instanceof PersonBean) {
            this.personBean = (PersonBean) bean;

            // Update the fields with the current property values
            nameField.setText(personBean.getName());
            ageField.setText(Integer.toString(personBean.getAge()));

            // Listen for property changes
            personBean.addPropertyChangeListener(new PropertyChangeListener() {
                @Override
                public void propertyChange(PropertyChangeEvent evt) {
                    if ("name".equals(evt.getPropertyName())) {
                        nameField.setText((String) evt.getNewValue());
                    } else if ("age".equals(evt.getPropertyName())) {
                        ageField.setText(evt.getNewValue().toString());
                    }
                }
            });
        }
    }
}
