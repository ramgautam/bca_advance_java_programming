package fonts;

import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;

public class CustomFontExample {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            // Create a new JFrame
            JFrame frame = new JFrame("Custom Font Example");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            // Create a JPanel with a FlowLayout
            JPanel panel = new JPanel(new FlowLayout());

            // Load and set the custom font
            try {
                // Specify the path to your font file
                File fontFile = new File("path/to/MyCustomFont.ttf");
                Font customFont = Font.createFont(Font.TRUETYPE_FONT, fontFile).deriveFont(24f);

                // Register the font
                GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
                ge.registerFont(customFont);

                // Create a JLabel and set the custom font
                JLabel label = new JLabel("This is a custom font!");
                label.setFont(customFont);

                // Add the label to the panel
                panel.add(label);

            } catch (FontFormatException | IOException e) {
                e.printStackTrace();
            }

            // Add the panel to the frame
            frame.add(panel);

            // Pack the frame to arrange the components
            frame.pack();

            // Set the frame's location to center of the screen
            frame.setLocationRelativeTo(null);

            frame.setSize(600, 400);

            // Make the frame visible
            frame.setVisible(true);
        });
    }
}
