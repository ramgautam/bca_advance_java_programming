import javax.swing.*;
import java.awt.*;

public class DimensionExample {

    public static void main(String[] args) {

            // Create a new JFrame
            JFrame frame = new JFrame("Dimension Example");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            // Create a JPanel with a FlowLayout
            JPanel panel = new JPanel(new FlowLayout());

            // Create a JButton and set its preferred size
            JButton button = new JButton("Click Me");
            button.setPreferredSize(new Dimension(200, 50));

            // Create a JLabel and set its preferred size
            JLabel label = new JLabel("Hello, World!");
            label.setPreferredSize(new Dimension(150, 30));

            // Create a JTextField and set its preferred size
            JTextField textField = new JTextField();
            textField.setPreferredSize(new Dimension(300, 30));

            // Add components to the panel
            panel.add(button);
            panel.add(label);
            panel.add(textField);

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
