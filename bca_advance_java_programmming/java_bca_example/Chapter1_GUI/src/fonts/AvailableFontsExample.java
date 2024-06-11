package fonts;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AvailableFontsExample {

    public static void main(String[] args) {

            // Create a new JFrame
            JFrame frame = new JFrame("Available Fonts Example");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            // Create a JPanel with a FlowLayout
            JPanel panel = new JPanel(new FlowLayout());

            // Create a JLabel to display the selected font
            JLabel label = new JLabel("Sample Text");
            label.setFont(new Font("Preeti", Font.PLAIN, 24));

            // Get all available font family names
            GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
            String[] fontNames = ge.getAvailableFontFamilyNames();

            // Create a JComboBox with the font names
            JComboBox<String> fontComboBox = new JComboBox<>(fontNames);

            // Add an ActionListener to the JComboBox to change the font of the JLabel
            fontComboBox.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    String selectedFont = (String) fontComboBox.getSelectedItem();
                    label.setFont(new Font(selectedFont, Font.ITALIC, 24));
                }
            });

            // Add components to the panel
            panel.add(new JLabel("Select Font:"));
            panel.add(fontComboBox);
            panel.add(label);

            // Add the panel to the frame
            frame.add(panel);

            // Pack the frame to arrange the components
            frame.pack();

            // Set the frame's location to center of the screen
            frame.setLocationRelativeTo(null);

            // Make the frame visible
            frame.setVisible(true);

    }
}
