package image;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

public class ImageButtonExample {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            // Create a new JFrame
            JFrame frame = new JFrame("Image Button Example");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setLayout(new BorderLayout());

            // Load the image
            Image image = null;
            try {
                image = ImageIO.read(new File("/Users/ramgautam/Downloads/garden-rose-red-pink-56866.jpeg"));
            } catch (IOException e) {
                e.printStackTrace();
                System.exit(1);
            }

            // Create an ImageIcon
            ImageIcon icon = new ImageIcon(image);

            // Create a JButton with the image icon
            JButton button = new JButton(icon);
            button.setPreferredSize(new Dimension(150, 30));

            // Create a JLabel to display the image when the button is clicked
            JLabel imageLabel = new JLabel();
            imageLabel.setPreferredSize(new Dimension(150, 30));
            imageLabel.setHorizontalAlignment(JLabel.CENTER);
            imageLabel.setVerticalAlignment(JLabel.CENTER);

            // Add an ActionListener to the button to display the image in the label
            button.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    imageLabel.setIcon(icon);
                    imageLabel.setPreferredSize(new Dimension(150, 30));
                    JOptionPane.showMessageDialog(null, "Image Button Clicked!");
                }
            });

            // Add the button and label to the frame
            frame.add(button, BorderLayout.NORTH);
            frame.add(imageLabel, BorderLayout.CENTER);

            // Set the frame size and make it visible
            frame.setSize(400, 400);
            frame.setLocationRelativeTo(null);
            frame.setVisible(true);
        });
    }

  }


