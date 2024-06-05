package adapter_class;

import javax.swing.*;
import java.awt.event.*;

public class FocusAdapterExample extends JFrame {
    private JTextField textField1;
    private JTextField textField2;
    private JLabel label;

    public FocusAdapterExample() {
        setTitle("Focus Adapter Example");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null); // Center the frame

        label = new JLabel("Focus on the text fields", SwingConstants.CENTER);
        textField1 = new JTextField("Text Field 1");
        textField2 = new JTextField("Text Field 2");

        // Create a FocusAdapter and add it to both text fields
        FocusAdapter focusAdapter = new FocusAdapter() {
            @Override
            public void focusGained(FocusEvent e) {
                label.setText(e.getComponent().getName() + " gained focus");
            }

            @Override
            public void focusLost(FocusEvent e) {
                label.setText(e.getComponent().getName() + " lost focus");
            }
        };

        // Set names for the text fields for identification
        textField1.setName("Text Field 1");
        textField2.setName("Text Field 2");

        // Add the FocusAdapter to both text fields
        textField1.addFocusListener(focusAdapter);
        textField2.addFocusListener(focusAdapter);

        setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));
        add(label);
        add(textField1);
        add(textField2);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            FocusAdapterExample example = new FocusAdapterExample();
            example.setVisible(true);
        });
    }
}
