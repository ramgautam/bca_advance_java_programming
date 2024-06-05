package adapter_class;

import javax.swing.*;
import java.awt.event.*;

public class KeyAdapterExample extends JFrame {
    private JLabel label;

    public KeyAdapterExample() {
        setTitle("Key Adapter Example");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null); // Center the frame

        label = new JLabel("Type something in this window", SwingConstants.CENTER);
        add(label);

        addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                label.setText("Key Pressed: " + KeyEvent.getKeyText(e.getKeyCode()));
            }

            @Override
            public void keyReleased(KeyEvent e) {
                label.setText("Key Released: " + KeyEvent.getKeyText(e.getKeyCode()));
            }

            @Override
            public void keyTyped(KeyEvent e) {
                label.setText("Key Typed: " + e.getKeyChar());
            }
        });

        setFocusable(true); // Ensure the frame can receive key events
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            KeyAdapterExample example = new KeyAdapterExample();
            example.setVisible(true);
        });
    }
}

