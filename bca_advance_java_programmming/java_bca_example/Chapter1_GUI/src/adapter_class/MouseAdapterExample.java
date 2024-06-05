package adapter_class;

import javax.swing.*;
import java.awt.event.*;

public class MouseAdapterExample extends JFrame {
    public MouseAdapterExample() {
        setTitle("Mouse Adapter Example");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel label = new JLabel("Click anywhere inside the window.");
        add(label);

        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                System.out.println("Mouse clicked at coordinates: " + e.getX() + ", " + e.getY());
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                System.out.println("Mouse entered the window.");
            }

            @Override
            public void mouseExited(MouseEvent e) {
                System.out.println("Mouse exited the window.");
            }
        });
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            MouseAdapterExample example = new MouseAdapterExample();
            example.setVisible(true);
        });
    }
}
