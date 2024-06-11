package adapter_class;

import javax.swing.*;
import java.awt.event.*;

public class WindowAdapterExample extends JFrame  {

    public WindowAdapterExample() {
        setTitle("Window Adapter Example");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        setLocationRelativeTo(null); // Center the frame

        JLabel label = new JLabel("Close the window to see the event", SwingConstants.CENTER);
        add(label);

        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                int response = JOptionPane.showConfirmDialog(
                        WindowAdapterExample.this,
                        "Are you sure you want to close the window?",
                        "Confirm Exit",
                        JOptionPane.YES_NO_OPTION,
                        JOptionPane.QUESTION_MESSAGE);

                if (response == JOptionPane.YES_OPTION) {
                    System.exit(0);
                }
            }

            @Override
            public void windowOpened(WindowEvent e) {
                System.out.println("Window opened");
            }

            @Override
            public void windowClosed(WindowEvent e) {
                System.out.println("Window closed");
            }

            @Override
            public void windowIconified(WindowEvent e) {
                System.out.println("Window minimized");
            }

            @Override
            public void windowDeiconified(WindowEvent e) {
                System.out.println("Window restored");
            }

            @Override
            public void windowActivated(WindowEvent e) {
                System.out.println("Window activated");
            }

            @Override
            public void windowDeactivated(WindowEvent e) {
                System.out.println("Window deactivated");
            }
        });
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            WindowAdapterExample example = new WindowAdapterExample();
            example.setVisible(true);
        });
    }
}
