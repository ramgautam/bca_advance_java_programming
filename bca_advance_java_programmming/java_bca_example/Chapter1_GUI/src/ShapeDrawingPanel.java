import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;

public class ShapeDrawingPanel extends JPanel {

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;

        // Set rendering hints for better graphics quality
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        // Draw a rectangle
        g2d.setColor(Color.BLUE);
        g2d.fillRect(50, 50, 100, 50);

        // Draw an oval
        g2d.setColor(Color.RED);
        g2d.fillOval(200, 50, 100, 50);

        // Draw a line
        g2d.setColor(Color.BLACK);
        g2d.drawLine(50, 150, 200, 150);

        // Draw a round rectangle
        g2d.setColor(Color.GREEN);
        g2d.fillRoundRect(50, 200, 100, 50, 20, 20);

        // Draw a polygon
        int[] xPoints = {200, 250, 300, 250};
        int[] yPoints = {200, 150, 200, 250};
        g2d.setColor(Color.MAGENTA);
        g2d.fillPolygon(xPoints, yPoints, 4);

        // Draw a custom shape using GeneralPath
        GeneralPath path = new GeneralPath();
        path.moveTo(100, 300);
        path.lineTo(150, 350);
        path.lineTo(50, 350);
        path.closePath();
        g2d.setColor(Color.ORANGE);
        g2d.fill(path);
    }

    public static void main(String[] args) {

            JFrame frame = new JFrame("2D Shape Drawing");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            ShapeDrawingPanel panel = new ShapeDrawingPanel();
            panel.setPreferredSize(new Dimension(400, 400));

            frame.add(panel);
            frame.pack();
            frame.setLocationRelativeTo(null); // Center the frame
            frame.setVisible(true);

    }
}
