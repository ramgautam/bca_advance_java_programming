package layout;

import javax.swing.*;
import java.awt.*;

public class FlowLayoutExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Flow Layout Example");

        // Create a panel with FlowLayout
        frame.setLayout(new FlowLayout());

        // Add buttons to the panel
        for (int i = 1; i <= 10; i++) {
            frame.add(new JButton("Button " + i));
        }

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 150);
        frame.setVisible(true);
    }
}
