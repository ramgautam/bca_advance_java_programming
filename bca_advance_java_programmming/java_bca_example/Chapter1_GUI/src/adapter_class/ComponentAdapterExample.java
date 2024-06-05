package adapter_class;

import javax.swing.*;
import java.awt.event.*;

public class ComponentAdapterExample extends JFrame {
    public ComponentAdapterExample() {
        setTitle("Component Adapter Example");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null); // Center the frame

        JLabel label = new JLabel("Resize or move the window", SwingConstants.CENTER);
        add(label);

        addComponentListener(new ComponentAdapter() {
            @Override
            public void componentResized(ComponentEvent e) {
                System.out.println("Component resized to: " + getSize());
            }

            @Override
            public void componentMoved(ComponentEvent e) {
                System.out.println("Component moved to: " + getLocation());
            }

            @Override
            public void componentShown(ComponentEvent e) {
                System.out.println("Component shown");
            }

            @Override
            public void componentHidden(ComponentEvent e) {
                System.out.println("Component hidden");
            }
        });
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            ComponentAdapterExample example = new ComponentAdapterExample();
            example.setVisible(true);
        });
    }
}
